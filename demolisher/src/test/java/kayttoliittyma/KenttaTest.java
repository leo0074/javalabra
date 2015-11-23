
package kayttoliittyma;

import graphicsMock.GraphicsMock;
import org.junit.Test;
import static org.junit.Assert.*;

public class KenttaTest {
    
    public KenttaTest() {
    }
    
    @Test
    public void testaaLuonti() {
        Kentta kentta = new Kentta(0);
        assertTrue(kentta.getBlockerit() != null && kentta.getPallo() != null);       
    }
    
    @Test
    public void testaaPiirto() {
        Kentta kentta = new Kentta(0);
        GraphicsMock g = new GraphicsMock();
        kentta.paintComponent(g);
        assertTrue(!g.getKoordinaatit().isEmpty());
        assertTrue(g.getColor()!=null);
        assertTrue(g.getPiirrot() == 8);
    }
    
    @Test
    public void testaaStartJaPause() {
        Kentta kentta = new Kentta(0);
        kentta.start();
        assertTrue(kentta.onPaalla());
        kentta.pause();
        assertFalse(kentta.onPaalla());
    }
     
    @Test
    public void testaaPelinLopetus() {
        Kentta kentta = new Kentta(0);
        kentta.start();
        kentta.lopetaPeli();
        assertTrue(kentta.getPeliOhi());
        assertTrue(!kentta.onPaalla());
        assertTrue(kentta.getViesti().getViesti().equals("Game over!"));            
    }
    
    
}
