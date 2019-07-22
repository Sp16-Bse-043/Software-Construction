/**
 * Java Chain of responsibility pattern
 * The class illustrates how the ATM uses chain of responsibility pattern
 * to dispense 1000 from bigger Amount of Currency Notes
 *
 * @author Atif Ali Khan: sp16-bse-043
 * @version 2.00
 * @since 22 Jul 2019
 */
package finallab;

/**
 *
 * @author sp16-bse-043
 */
public class Rs1000 implements Chain {

    private Chain chain;

    /**
     * {@inheritDoc}
     *
     * @param nextChain setting the next chain for currency
     */
    @Override
    public void setNextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    /**
     * {@inheritDoc} Simple method to fetch the Currency from user The method
     * Creates number of possible Notes of 1000 from Total Currency amount
     * Entered
     *
     * @param cur Integer variable to be entered is amount of currency
     * @see Rs1000
     * @deprecated
     * @since version 1.00
     */
    @Override
    public void fetch(Currency cur) {
        if (cur.getAmount() >= 1000) {
            int num = cur.getAmount() / 1000-1;
            int remainder = (cur.getAmount() % 1000)+1000;
            System.out.println("Getting: " + num + " RS 1000 note");
            
            if (remainder != 0) {
                this.chain.fetch(new Currency(remainder));
            }
        } else {
            this.chain.fetch(cur);
        }
    }

}
