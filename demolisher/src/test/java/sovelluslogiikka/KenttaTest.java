/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import graphicsMock.GraphicsMock;
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
public class KenttaTest {
    
    public KenttaTest() {
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
    public void testaaLuonti(){
        Kentta kentta = new Kentta();
        kentta.luo(1);
        assertTrue(kentta.getBlockerit() != null && kentta.getPallo() != null);       
    }
    
    @Test
    public void testaaPiirto(){
        Kentta kentta = new Kentta();
        kentta.luo(1);
        GraphicsMock g = new GraphicsMock();
        kentta.paint(g);
        assertTrue(!g.getKoordinaatit().isEmpty());
        assertTrue(g.getColor()!=null);
        assertTrue(g.getPiirrot() >= 3);
    }
    
    
}
