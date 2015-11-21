package kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Luokka kuuntelee näppäimistöä, jonka avulla pelin voi aloittaa, pysäyttää tai
 * jatkaa.
 */
public class Nappaimisto implements KeyListener {
    
    private Kentta kentta;
    public Nappaimisto(Kentta kentta) {
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
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
