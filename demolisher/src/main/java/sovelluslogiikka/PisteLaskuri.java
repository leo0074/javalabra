package sovelluslogiikka;

import java.awt.Graphics;

/**
 * Pisteluokka, joka pitää kirjaa pisteistä. 
 */
public class PisteLaskuri {
    private int pisteet;
    public PisteLaskuri(){
        pisteet = 0;
    }
    
    public int getPisteet(){
        return pisteet;
    }
    
    /**
     * Kasvattaa pisteiden määrää
     */
    public void kasvataPisteita() {
        pisteet++;
    }    
    
    /**
     * Piirtää pisteet kentän oikeaan alareunaan
     * @param g Graphics 
     */
    public void paint(Graphics g) {
        g.drawString("Pisteet: " + pisteet, 400, 600);
    }  
}
