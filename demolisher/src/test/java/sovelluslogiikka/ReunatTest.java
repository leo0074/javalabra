
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
    public void testaaPallonTormaaminen(){
       Pallo pallo1 = new Pallo(100, 150, 4, 4);
       Reunat reuna = new Reunat();
       reuna.tormaa(pallo1);
       assertTrue(pallo1.getDx() == 4 && pallo1.getDy() == 4);
       
       Pallo pallo2 = new Pallo(5, 10, 4, 4);
       reuna.tormaa(pallo2);
       assertTrue(pallo2.getDx() == -4 && pallo2.getDy() == 4);
       
       Pallo pallo3 = new Pallo(6, 10, 4, 4);
       reuna.tormaa(pallo3);
       assertTrue(pallo3.getDx() == 4 && pallo3.getDy() == 4);  
       
       Pallo pallo4 = new Pallo(495, 5, 4, 4);
       reuna.tormaa(pallo4);
       assertTrue(pallo4.getDx() == -4 && pallo4.getDy() == -4); 
       
       
    }
    
}
