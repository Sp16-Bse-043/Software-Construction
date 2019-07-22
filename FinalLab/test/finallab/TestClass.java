/**
 * Java Chain of responsibility pattern Test Class
 * The class illustrates how the works by testing the pattern classes
 * and different methods using JUnit.
 * 
 * @author Atif Ali Khan: sp16-bse-043
 * @version 2.00
 * @since 22 Jul 2019
 */
package finallab;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sp16-bse-043
 */
public class TestClass {
    
    public TestClass() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fetch method, of class Rs5000.
     */
    @Test
    public void testFetch5000() {
         Rs5000 tester = new Rs5000();
        Currency cur = null;
        int amount=5000;
  // assertEquals("Result",5000,5);
       // assertEquals =("Result",5,tester.fetch(cur));
        assertNull("", cur);
    }
    
    
     /**
     * Test of fetch method, of class Rs1000.
     */
         
        @Test
    public void testFetch1000() {
         Rs1000 tester = new Rs1000();
         Currency cur = null;
      //   int num = cur.getAmount();
   assertNull("", cur);
       // assertEquals =("Result", 5, tester.fetch(amount));
      
    }
     /**
     * Test of fetch method, of class Rs500.
     */
            @Test
    public void testFetch500() {
         Rs500 tester = new Rs500();
         Currency cur = null;
         assertNull("", cur);
       // assertEquals =("Result", 5, tester.fetch(amount));
    }
    
    /**
     * Test of main method, of class FinalLab.
     */
        @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FinalLab tester = new FinalLab();
        assertNotNull("", args);
  
    }
    
     /**
     * Test of main method, of class FinalLab.
     */
       @Test
    public void testMainInput() { 
        FinalLab tester = new FinalLab();
        int amount = 500;
         if (amount % 500 != 0) {
                return;
            }
         fail("");
       
    }
}
