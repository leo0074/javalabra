
package sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ReunatTest {
    
    public ReunatTest() {
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
    public void testaaPallonTormaaminen() {
       Pallo pallo = new Pallo(100, 150, 4, 4);
       Reunat reuna = new Reunat();
       reuna.tormaa(pallo);
       assertTrue(pallo.getDx() == 4 && pallo.getDy() == 4);
       
       pallo = new Pallo(5, 10, 4, 4);
       reuna.tormaa(pallo);
       assertTrue(pallo.getDx() == -4 && pallo.getDy() == 4);
       
       pallo = new Pallo(495, 10, 4, 4);
       reuna.tormaa(pallo);
       assertTrue(pallo.getDx() == -4 && pallo.getDy() == 4);  
       
       pallo = new Pallo(100, 5, 4, 4);
       reuna.tormaa(pallo);
       assertTrue(pallo.getDx() == 4 && pallo.getDy() == -4);  
       
       
       
    }
    
}
