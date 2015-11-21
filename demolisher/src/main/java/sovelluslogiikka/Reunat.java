package sovelluslogiikka;


import java.awt.Graphics;

/**
 * Reunaluokka, joka tutkii, osuuko pallo pelikentän reunoille
 */
public class Reunat implements Blockeri {

    public Reunat() {
        
    }
    
    @Override
    public void tormaa(Pallo pallo) {
        if (pallo.getX() <= 5 || pallo.getX() >= 495)
            pallo.kaanny(false);
        if (pallo.getY() <= 5)
            pallo.kaanny(true);
    }

    @Override
    public void paint(Graphics g) {     
    }

}
