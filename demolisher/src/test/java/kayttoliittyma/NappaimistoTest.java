package kayttoliittyma;

import java.awt.Component;
import java.awt.event.KeyEvent;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class NappaimistoTest {
        public NappaimistoTest() {
    }
    
   @Test
   public void testaaStratti() {
        Kentta kentta = new Kentta(0);
        Nappaimisto nappaimisto = new Nappaimisto(kentta);
        KeyEvent e = new KeyEvent(new Component(){}, 0, 0, 0, 83, 's', 0);
        nappaimisto.keyPressed(e);
        assertTrue(kentta.onPaalla());  
        e = new KeyEvent(new Component(){}, 0, 0, 0, 80, 'p', 0);
        nappaimisto.keyPressed(e);
        assertTrue(!kentta.onPaalla());
   }
}
