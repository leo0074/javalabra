package kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.Kayttoliittyma;

/**
 * Luokka kuuntelee näppäimistöä, jonka avulla pelin voi aloittaa, pysäyttää tai
 * jatkaa.
 */
public class Nappaimisto implements KeyListener {
    /**
     * Kenttä, jonka tilaa muutetaan
     */
    private Kentta kentta;
    public Nappaimisto(Kentta kentta, Kayttoliittyma liittyma) {
        this.kentta = kentta;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 's') {
            kentta.start();
        }
        
        if (e.getKeyChar() == 'p') {
            kentta.pause();
            kentta.repaint();
        }
        
        if (e.getKeyChar() == 'r' && kentta.getPeliOhi()) {
            kentta.alusta(1);
        }
        
        if (e.getKeyChar() == 'n' && kentta.kenttaVoitettu()) {
            kentta.alusta(2);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}