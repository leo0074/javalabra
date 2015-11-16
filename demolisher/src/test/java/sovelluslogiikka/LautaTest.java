package sovelluslogiikka;

import graphicsMock.GraphicsMock;
import java.awt.Color;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LautaTest {
    public LautaTest() {
    }


    @Test
    public void testaaLaudanPiirtyminen(){
        Lauta lauta = new Lauta(250);
        GraphicsMock g = new GraphicsMock();
        lauta.paint(g);
        ArrayList<Integer> koord = g.getKoordinaatit();
        assertTrue(koord.get(0) == 250);
        assertTrue(koord.get(1) == 550);
        assertTrue(koord.get(2) == 340);
        assertTrue(koord.get(3) == 560);
        assertTrue(g.getColor() == Color.BLACK);
        
    }
    @Test
    public void testaaTormays(){
        Pallo pallo = new Pallo(250, 545, 4, 4);
        Lauta lauta = new Lauta(250);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == -4);
        assertTrue(pallo.getDy() == -4);
            
        pallo = new Pallo(260, 550, 4, 4);
        lauta.tormaa(pallo);
        System.out.println(pallo.getDx());
        assertTrue(pallo.getDx() == -3);
        
        pallo = new Pallo(270, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == -2);
        
        pallo = new Pallo(280, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == -1);
        
        pallo = new Pallo(290, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == 0);
        
        pallo = new Pallo(300, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == 1);
        
        pallo = new Pallo(310, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == 2);
        
        pallo = new Pallo(320, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == 3);
        
        pallo = new Pallo(330, 550, 4, 4);
        lauta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4);               
    }
    @Test
    public void testaaGetteri(){
        Lauta lauta = new Lauta(250);
        assertTrue(lauta.getX() == 250);
    }
    
}
