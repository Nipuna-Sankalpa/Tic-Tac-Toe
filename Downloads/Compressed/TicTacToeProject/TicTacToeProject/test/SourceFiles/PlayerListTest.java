/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SourceFiles;

import java.util.ArrayList;
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
public class PlayerListTest {
    
    public PlayerListTest() {
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
     * Test of addPlayers method, of class PlayerList.
     */
    @Test
    public void testAddPlayers() {
        System.out.println("addPlayers");
        Human player = null;
        PlayerList instance = new PlayerList();
        instance.addPlayers(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class PlayerList.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        PlayerList instance = new PlayerList();
        ArrayList expResult = null;
        ArrayList result = instance.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class PlayerList.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        String name = "";
        PlayerList instance = new PlayerList();
        Human expResult = null;
        Human result = instance.getPlayers(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contain method, of class PlayerList.
     */
    @Test
    public void testContain() {
        System.out.println("contain");
        String name = "";
        PlayerList instance = new PlayerList();
        boolean expResult = false;
        boolean result = instance.contain(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerName method, of class PlayerList.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        int index = 0;
        PlayerList instance = new PlayerList();
        String expResult = "";
        String result = instance.getPlayerName(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class PlayerList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PlayerList instance = new PlayerList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
