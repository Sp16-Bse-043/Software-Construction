/**
 * Java Chain of responsibility pattern
 * The class illustrates how the ATM uses chain of responsibility pattern
 * to dispense 5000 from bigger Amount of Currency Notes
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
public class Rs5000 implements Chain {

    
    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void fetch(Currency cur) {
        if (cur.getAmount() >= 5000) {
            int num = cur.getAmount() / 5000-1;
                 int remainder = (cur.getAmount() % 5000)+5000;
                 System.out.println("Getting " + num + " Rs 5000 note");
            
            if (remainder != 0) {
                this.chain.fetch(new Currency(remainder));
            }
        } else {
            this.chain.fetch(cur);
        }
    }
}