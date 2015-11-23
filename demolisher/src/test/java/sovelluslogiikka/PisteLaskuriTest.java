package sovelluslogiikka;

import graphicsMock.GraphicsMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PisteLaskuriTest {
    
    private PisteLaskuri pisteet;
    public PisteLaskuriTest() {
    }
    

    @Before
    public void setUp() {
        pisteet = new PisteLaskuri();
    }
    

    @Test
    public void testaaPisteidenPiirto() {
        GraphicsMock g = new GraphicsMock();
        pisteet.paint(g);
        assertTrue(g.getViesti().equals("Pisteet: 0"));
    }
    
    @Test
    public void testaaPisteidenKasvaminen(){
        pisteet.kasvataPisteita();
        assertTrue(pisteet.getPisteet() == 1);
    }
    
}
