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
public class LayerTest {
    
    public LayerTest() {
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
     * Test of refreshLayer method, of class Layer.
     */
    @Test
    public void testRefreshLayer() {
        System.out.println("refreshLayer");
        Layer instance = null;
        instance.refreshLayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByState method, of class Layer.
     */
    @Test
    public void testSearchByState() {
        System.out.println("searchByState");
        int[][] state = null;
        Layer instance = null;
        Node expResult = null;
        Node result = instance.searchByState(state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchById method, of class Layer.
     */
    @Test
    public void testSearchById() {
        System.out.println("searchById");
        String id = "";
        Layer instance = null;
        Node expResult = null;
        Node result = instance.searchById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
