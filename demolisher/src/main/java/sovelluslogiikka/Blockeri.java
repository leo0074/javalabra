package sovelluslogiikka;

import java.awt.Graphics;

/**
 * Rajapinta objekteille, jooihin pallo voi osua ja jotka piirretään 
 * pelikentälle.
 */
public interface Blockeri {
    
    /**
     * Tutkii osuuko pallo objektiin
     * @param pallo pallo, jonka törmääminen tutkitaan.
     */
    public void tormaa(Pallo pallo);
    
    /**
     * Määrittelee miten kyseinen objekti piirretään kentälle
     * @param g Graphics 
     */
    public void paint(Graphics g);
}
