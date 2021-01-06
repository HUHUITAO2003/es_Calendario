/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliet
 */
public class MetodCalendarioTest {
    
    public MetodCalendarioTest() {
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
     * Test of GiornoSettimana method, of class MetodCalendario.
     */
    @Test
    public void testGiornoSettimana() {
        System.out.println("GiornoSettimana");
        MetodCalendario instance = new MetodCalendario(31,12,2020);
        String expResult = "giovedi";
        String result = instance.GiornoSettimana();
        assertEquals(expResult, result);
    }

    /**
     * Test of GiornoSuccessivo method, of class MetodCalendario.
     */
    @Test
    public void testGiornoSuccessivo() {
        System.out.println("GiornoSuccessivo");
        MetodCalendario instance = new MetodCalendario(31,12,2020);
        String expResult = "1/1/2021";
        String result = instance.GiornoSuccessivo();
        assertEquals(expResult, result);
    }
    
}
