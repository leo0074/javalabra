/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leo
 */
public class LaattaTest {
    
    public LaattaTest() {
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

    @Test
    public void testPallontormaaminenYlhaalta(){
        Pallo pallo = new Pallo(150, 100, 4, -4);
        Laatta laatta1 = new Laatta(100, 100, Color.BLACK);
        laatta1.tormaa(pallo); //pallo kääntyy
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
        Laatta laatta2 = new Laatta(0, 0, Color.BLUE);
        laatta2.tormaa(pallo); //pallo ei käänny
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
    }
            
    
}
