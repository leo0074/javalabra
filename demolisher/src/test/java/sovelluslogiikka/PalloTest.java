/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

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
public class PalloTest {
    
    public PalloTest() {
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
    public void testaaPallonKaantyminen() {
        Pallo pallo = new Pallo(100, 100, 4, 4);
        pallo.kaanny(true);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);
        pallo.kaanny(false);
        assertTrue(pallo.getDx() == -4 && pallo.getDy() == -4);
    }
}
