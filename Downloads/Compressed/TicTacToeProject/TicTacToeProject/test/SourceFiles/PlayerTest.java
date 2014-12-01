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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of playTurn method, of class Player.
     */
    @Test
    public void testPlayTurn() {
        System.out.println("playTurn");
        int pl = 0;
        int turn = 0;
        Player instance = new PlayerImpl();
        instance.playTurn(pl, turn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerInit method, of class Player.
     */
    @Test
    public void testPlayerInit() {
        System.out.println("playerInit");
        Player instance = new PlayerImpl();
        instance.playerInit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyWin method, of class Player.
     */
    @Test
    public void testNotifyWin() {
        System.out.println("notifyWin");
        int pl = 0;
        Player instance = new PlayerImpl();
        instance.notifyWin(pl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyLose method, of class Player.
     */
    @Test
    public void testNotifyLose() {
        System.out.println("notifyLose");
        int pl = 0;
        Player instance = new PlayerImpl();
        instance.notifyLose(pl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyDraw method, of class Player.
     */
    @Test
    public void testNotifyDraw() {
        System.out.println("notifyDraw");
        Player instance = new PlayerImpl();
        instance.notifyDraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new PlayerImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinCount method, of class Player.
     */
    @Test
    public void testGetWinCount() {
        System.out.println("getWinCount");
        Player instance = new PlayerImpl();
        int expResult = 0;
        int result = instance.getWinCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLossCount method, of class Player.
     */
    @Test
    public void testGetLossCount() {
        System.out.println("getLossCount");
        Player instance = new PlayerImpl();
        int expResult = 0;
        int result = instance.getLossCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrawCount method, of class Player.
     */
    @Test
    public void testGetDrawCount() {
        System.out.println("getDrawCount");
        Player instance = new PlayerImpl();
        int expResult = 0;
        int result = instance.getDrawCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {
    }
    
}
