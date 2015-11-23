package sovelluslogiikka;

import graphicsMock.GraphicsMock;
import java.awt.Color;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaattaTest {
    
    public LaattaTest() {
    }

    @Test
    public void testaaEtteiPalloKaannyTurhaan() {
        Pallo pallo = new Pallo(250, 200, 4, 4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
    }
    
    @Test
    public void testaaLaatandeaktivoituminen() {
        Pallo pallo = new Pallo(140, 100, 4, -4);
        PisteLaskuri laskuri = new PisteLaskuri();
        Laatta laatta = new Laatta(100, 100, Color.BLACK, laskuri);
        laatta.tormaa(pallo);
        assertFalse(laatta.aktiivinen());
        assertTrue(laskuri.getPisteet() == 1);
    }
    
    @Test
    public void testPallontormaaminenYlhaalta() {
        Pallo pallo = new Pallo(150, 100, 4, -4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
        
        laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        pallo = new Pallo(150, 95, 4, -4);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);        
        
        
    }
    
    @Test
    public void testPallontormaaminenAlhaalta() {
        Pallo pallo = new Pallo(125, 125, 4, 4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);
        
        laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        pallo = new Pallo(120, 120, 4, 4);
        laatta.tormaa(pallo);
        System.out.println(pallo.getDx());
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);        
        
    }    
    
    @Test
    public void testPallontormaaminenVasemmalta() {
        Pallo pallo = new Pallo(95, 120, 4, -4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == -4 && pallo.getDy() == -4);
        
        laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        pallo = new Pallo(95, 100, 4, -4);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == -4 && pallo.getDy() == -4);        
        
    }        

    @Test
    public void testPallontormaaminenOikealta() {
        Pallo pallo = new Pallo(155, 110, -4, -4);
        Laatta laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);
        
        laatta = new Laatta(100, 100, Color.BLACK, new PisteLaskuri());
        pallo = new Pallo(150, 110, -4, -4);
        laatta.tormaa(pallo);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);        
    }      
    
    @Test
    public void testaaLaatanPiirtyminen() {
        Laatta laatta = new Laatta(350, 245, Color.BLUE, new PisteLaskuri());
        GraphicsMock g = new GraphicsMock();
        laatta.paint(g);
        ArrayList<Integer> koord = g.getKoordinaatit();
        assertTrue(koord.get(0) == 350);
        assertTrue(koord.get(1) == 245);
        assertTrue(koord.get(2) == 400);
        assertTrue(koord.get(3) == 265);
        assertTrue(g.getColor() == Color.BLACK);
    }
    
    @Test
    public void testaaDeaktiivinenLaattaEiPiirry() {
        Laatta laatta = new Laatta(350, 245, Color.BLUE, new PisteLaskuri());
        GraphicsMock g = new GraphicsMock();
        laatta.tormaa(new Pallo (350, 245, 4, 4));
        laatta.paint(g);
        assertTrue(g.getPiirrot() == 0);
    }     
}