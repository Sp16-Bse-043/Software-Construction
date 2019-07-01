/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.JUnit;
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
public class JUnitTest {

    JUnit tester = new JUnit();

    @Test
    public void Addtest1() {
        assertEquals("10 + 5 must be 15", 15, tester.Add(10, 5));

    }
    
    @Test
    public void Addtest2() {
        assertEquals("10 + 5 must be 15", 3, tester.Add(10, 5));

    }

    @Test
    public void Multiply() {
        assertEquals("10 * 5 must be 50", 50, tester.Mul(10, 5));
    }

    @Test
    public void Subtraction() {

        assertEquals("10 - 5 must be 5", 5, tester.Sub(10, 5));
    }

    @Test
    public void Division() {

        assertEquals("50 / 5 must be 10", 10, tester.Div(50, 5));
    }

    public JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
