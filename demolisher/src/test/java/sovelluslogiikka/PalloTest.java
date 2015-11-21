
package sovelluslogiikka;

import graphicsMock.GraphicsMock;
import java.awt.Color;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void testaaPallonKaantyminen(){
        Pallo pallo = new Pallo(100, 100, 4, 4);
        pallo.kaanny(true);
        assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);
        pallo = new Pallo(100, 100, 4, 4);
        pallo.kaanny(false);
        assertTrue(pallo.getDx() == -4 && pallo.getDy() == 4);
    }
    
    @Test
    public void testaaPallonKierroksenPaivitys(){
        Pallo pallo = new Pallo(100, 100, 4, 4);
        pallo.seuraavaKierros();
        assertTrue(pallo.getKierros() == 1);
    }
    
    @Test
    public void testaaPallonPiirtyminen(){
        Pallo pallo = new Pallo(250, 145, 1, 4);
        GraphicsMock g = new GraphicsMock();
        pallo.paint(g);
        ArrayList<Integer> koord = g.getKoordinaatit();
        assertTrue(koord.get(0) == 245);
        assertTrue(koord.get(1) == 140);
        assertTrue(koord.get(2) == 255);
        assertTrue(koord.get(3) == 150);
        assertTrue(g.getColor() == Color.black);
    }
    
    @Test
    public void testaaPallonLiikkuminen(){
        Pallo pallo = new Pallo(250, 145, 1, 4);
        pallo.liiku();
        assertTrue(pallo.getX() == 251);
        assertTrue(pallo.getY() == 149);
        
        
    }
    
}
