
package kayttoliittyma;

import kayttoliittyma.Kentta;
import graphicsMock.GraphicsMock;
import org.junit.Test;
import static org.junit.Assert.*;

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
    
    @Test
    public void testaaStartJaPause(){
        Kentta kentta = new Kentta();
        kentta.start();
        assertTrue(kentta.onPaalla());
        kentta.pause();
        assertFalse(kentta.onPaalla());
    }
        
    
}
