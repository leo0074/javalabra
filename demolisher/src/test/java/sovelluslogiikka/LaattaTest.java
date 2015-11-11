/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import graphicsMock.GraphicsMock;
import java.awt.Color;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leo
 */
public class LaattaTest {
    
    public LaattaTest() {
    }


    @Test
    public void testaaEtteiPalloKaannyTurhaan(){
        Pallo pallo = new Pallo(250, 200, 4, 4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
    }
    
    @Test
    public void testPallontormaaminenYlhaalta(){
        Pallo pallo = new Pallo(140, 100, 4, -4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
        
        pallo = new Pallo(140, 95, 4, -4);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);        
        
        
    }
    
    @Test
    public void testPallontormaaminenAlhaalta(){
        Pallo pallo = new Pallo(125, 125, 4, 4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);
        
        pallo = new Pallo(120, 120, 4, 4);
        laatta.tormaa(pallo);
        System.out.println(pallo.getDx());
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);        
        
    }    
    
    @Test
    public void testPallontormaaminenVasemmalta(){
        Pallo pallo = new Pallo(100, 115, 4, -4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == -4 && pallo.getDy() == -4);
        
        pallo = new Pallo(95, 115, 4, -4);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == -4 && pallo.getDy() == -4);        
        
    }        

    @Test
    public void testPallontormaaminenOikealta(){
        Pallo pallo = new Pallo(155, 110, -4, -4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);
        
        pallo = new Pallo(150, 110, -4, -4);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);        
        
    }      
    
    @Test
    public void testaaLaatanPiirtyminen(){
        Laatta laatta = new Laatta(350, 245, Color.BLUE);
        GraphicsMock g = new GraphicsMock();
        laatta.paint(g);
        ArrayList<Integer> koord = g.getKoordinaatit();
        assertTrue(koord.get(0) == 350);
        assertTrue(koord.get(1) == 245);
        assertTrue(koord.get(2) == 400);
        assertTrue(koord.get(3) == 265);
        assertTrue(g.getColor() == Color.BLUE);
    }
}
