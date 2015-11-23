
package sovelluslogiikka;

import kayttoliittyma.Kentta;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PaivittajaTest {

    public PaivittajaTest() {
        
    }

    @Test
    public void testaaRunjaPause() {
        Kentta kentta = new Kentta(1);
        Paivittaja paivittaja = new Paivittaja(kentta);
        int pallonY1 = kentta.getPallo().getY();
        kentta.start();
        paivittaja.run();
        int pallonY2 = kentta.getPallo().getY();
        assertFalse(pallonY1 == pallonY2);       
    }    
    
    @Test
    public void testTaaRuninMetodikutsut() {
        Kentta kentta = new Kentta(0);
        Paivittaja paivittaja = new Paivittaja(kentta);
        kentta.start();
        paivittaja.run();
        assertTrue(kentta.getPallo().getKierros() == 1);
        assertFalse(kentta.getPeliOhi());        
        while(!kentta.getPallo().tarkistaPelinLoppuminen()){
            kentta.getPallo().liiku();
        }
        paivittaja.run();
        assertTrue(kentta.getPeliOhi());
        
        
    }
    
}
