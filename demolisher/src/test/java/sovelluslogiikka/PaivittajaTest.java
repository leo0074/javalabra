
package sovelluslogiikka;

import kayttoliittyma.Kentta;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PaivittajaTest {

    public PaivittajaTest(){
        
    }

    @Test
    public void testaaRun(){
        Kentta kentta = new Kentta();
        Paivittaja paivittaja = new Paivittaja(kentta);
        int pallonY1 = kentta.getPallo().getY();
        kentta.start();
        paivittaja.run();
        int pallonY2 = kentta.getPallo().getY();
        assertFalse(pallonY1 == pallonY2);       
    }
    
    
}
