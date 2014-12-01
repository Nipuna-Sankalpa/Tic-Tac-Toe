/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SourceFiles;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yellow Flash
 */
public class HumanTest {
    
    public HumanTest() {
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
     * Test of getWinCount method, of class Human.
     */
    @Test
    public void testGetWinCount() {
        System.out.println("getWinCount");
        Human instance = null;
        int expResult = 0;
        int result = instance.getWinCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLossCount method, of class Human.
     */
    @Test
    public void testGetLossCount() {
        System.out.println("getLossCount");
        Human instance = null;
        int expResult = 0;
        int result = instance.getLossCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrawCount method, of class Human.
     */
    @Test
    public void testGetDrawCount() {
        System.out.println("getDrawCount");
        Human instance = null;
        int expResult = 0;
        int result = instance.getDrawCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Human.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Human instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playTurn method, of class Human.
     */
    @Test
    public void testPlayTurn() {
        System.out.println("playTurn");
        int pl = 0;
        int turn = 0;
        Human instance = null;
        instance.playTurn(pl, turn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyWin method, of class Human.
     */
    @Test
    public void testNotifyWin() {
        System.out.println("notifyWin");
        int pl = 0;
        Human instance = null;
        instance.notifyWin(pl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyLose method, of class Human.
     */
    @Test
    public void testNotifyLose() {
        System.out.println("notifyLose");
        int pl = 0;
        Human instance = null;
        instance.notifyLose(pl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyDraw method, of class Human.
     */
    @Test
    public void testNotifyDraw() {
        System.out.println("notifyDraw");
        Human instance = null;
        instance.notifyDraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
