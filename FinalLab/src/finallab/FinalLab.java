/**
 * Java Chain of responsibility pattern
 * The class illustrates how the ATM uses chain of responsibility pattern
 * to dispense Different Currency Notes
 *
 * @author Atif Ali Khan: sp16-bse-043
 * @version 2.00
 * @since 22 Jul 2019
 */
package finallab;

import java.util.Scanner;

/**
 *
 * @author sp16-bse-043
 */
public class FinalLab {
    
 private Chain c1;
    public FinalLab() {
       
        /**
         * Initialize the Chain code
         */
        this.c1 = new Rs5000();
        Chain c2 = new Rs1000();
        Chain c3 = new Rs500();
   
        /**
         * Set the Chain of Responsibility code
         */
        c1.setNextChain(c2);
        c2.setNextChain(c3);
   
    }
    /**
     * This is the main method which makes use of Chain methods here we give the
     * amount of currency input and gets the output
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FinalLab atmDispenser = new FinalLab();
        while (true) {
            int amount = 0;
            System.out.println("Enter Amount to get:");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 500 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            /**
             * Process the Request code
             */
            atmDispenser.c1.fetch(new Currency(amount));
        }
    }
}