/**
 * Java Chain of responsibility pattern
 * The class illustrates and provides the currency
 * amount for ATM
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
public class Currency {

    /**
     * Variable that holds the amount of currency
     */
    private int amount;

    /**
     * Constructor with no initialized instance variables
     *
     * @param amt for the amount of Currency
     */
    public Currency(int amt) {
        this.amount = amt;
    }

    /**
     * Gets the Amount of currency code
     *
     * @return a <code> string </code> specifying the Currency amount
     */
    public int getAmount() {
        return this.amount;
    }
}