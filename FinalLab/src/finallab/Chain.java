/**
 * Java Chain of responsibility pattern
 * The Interface illustrates the Chain of responsibility NextChain
 * and also set the amount to be fetch by user
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

public interface Chain {

    /**
     * Sets the Next Chain for currency to be fetched
     *
     * @param nextChain setting the next chain for currency of Chain code
     */
    void setNextChain(Chain nextChain);

    /**
     * Sets the fetch Currency
     *
     * @param cur Chain code for Currency to be fetch
     */
    void fetch(Currency cur);
}