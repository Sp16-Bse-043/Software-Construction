/**
 * Java Chain of responsibility pattern
 * The class illustrates how the ATM uses chain of responsibility pattern
 * to dispense 500 from bigger Amount of Currency Notes
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
public class Rs500 implements Chain {

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
     * Creates number of possible Notes of 500 from Total Currency amount
     * Entered
     *
     * @param cur Integer variable to be entered is amount of currency
     * @see Rs500
     * @deprecated
     * @since version 1.00
     */
    @Override
    public void fetch(Currency cur) {
        if (cur.getAmount() >= 500) {
            int num = cur.getAmount() / 500;
            int remainder = cur.getAmount() % 500;
            System.out.println("Getting: " + num + " Rs 500 Note");
            if (remainder != 0) {
                this.chain.fetch(new Currency(remainder));
            }
        } else {
            this.chain.fetch(cur);
        }
    }
}