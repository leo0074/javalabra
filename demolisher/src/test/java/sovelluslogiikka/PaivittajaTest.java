
package sovelluslogiikka;

import java.awt.Color;
import java.util.ArrayList;
import kayttoliittyma.Kentta;
import static org.junit.Assert.*;
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
    public void testaaRuninMetodikutsut() {
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
    
    @Test
    public void testaaDeaktiivistenLaattojenPoistaja() {
        Kentta kentta = new Kentta(0);
        ArrayList<Blockeri> blockerit;
        Paivittaja paivittaja = new Paivittaja(kentta);
        blockerit = new ArrayList<>();
        blockerit.add(new Reunat());
        Laatta laatta = new Laatta (0, 0, Color.BLACK, new PisteLaskuri());
        laatta.deaktivoi(true, new Pallo (0, 0, 0, 0));
        blockerit.add(laatta);
        paivittaja.setBlockerit(blockerit);
        paivittaja.poistaDeaktiivisetLaatat();
        assertEquals(blockerit.size(), 1); 
        assertTrue(kentta.kenttaVoitettu());
    }    
}
