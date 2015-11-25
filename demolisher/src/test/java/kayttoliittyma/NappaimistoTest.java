package kayttoliittyma;

import java.awt.Component;
import java.awt.event.KeyEvent;
import static org.junit.Assert.*;
import org.junit.Test;


public class NappaimistoTest {
        public NappaimistoTest() {
    }
    
   @Test
   public void testaaStrattiJaPause() {
        Kentta kentta = new Kentta(0);
        Nappaimisto nappaimisto = new Nappaimisto(kentta, null);
        KeyEvent e = new KeyEvent(new Component(){}, 0, 0, 0, 83, 's', 0);
        nappaimisto.keyPressed(e);
        assertTrue(kentta.onPaalla());  
        e = new KeyEvent(new Component(){}, 0, 0, 0, 80, 'p', 0);
        nappaimisto.keyPressed(e);
        assertTrue(!kentta.onPaalla());
   }
   
   @Test
   public void TestaaSeuraavanKentanLuontiPainikeJaAlustus(){
        Kentta kentta = new Kentta(1);
        Nappaimisto nappaimisto = new Nappaimisto(kentta, null);
        KeyEvent e = new KeyEvent(new Component(){}, 0, 0, 0, 8, 'n', 0);
        nappaimisto.keyPressed(e);
        assertEquals(kentta.getKenttaNro(), 1);
        kentta.kaikkiLaatatTuhottu();
        nappaimisto.keyPressed(e);
        assertEquals(kentta.getKenttaNro(), 2);
        kentta.lopetaPeli();
        e = new KeyEvent(new Component(){}, 0, 0, 0, 8, 'r', 0);
        nappaimisto.keyPressed(e);
        assertEquals(kentta.getKenttaNro(), 1);
        
   }
}
