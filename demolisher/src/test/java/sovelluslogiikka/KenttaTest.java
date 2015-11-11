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
    
    @Test
    public void testaaLuonti(){
        Kentta kentta = new Kentta();
        assertTrue(kentta.getBlockerit() != null && kentta.getPallo() != null);       
    }
    
    @Test
    public void testaaPiirto(){
        Kentta kentta = new Kentta();
        GraphicsMock g = new GraphicsMock();
        kentta.paintComponent(g);
        assertTrue(!g.getKoordinaatit().isEmpty());
        assertTrue(g.getColor()!=null);
        assertTrue(g.getPiirrot() >= 3);
    }
    
    
}
