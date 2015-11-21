package sovelluslogiikka;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Laatta luokka kuvaa kentän yläosissa sijaitsevia laattoja, jotka pelaajan
 * on tarkoitus tuhota
 */
public class Laatta implements Blockeri {

    private final int x; //koordinaatit osoittavan laatan oikeaan yläkulmaan
    private final int y; //laatan koko on 50x20
    private final Color vari; //laatan väri
    private boolean aktiivinen;
    
    public Laatta(int x, int y, Color vari) {
        this.x = x;
        this.y = y;
        this.vari = vari;
        this.aktiivinen = true;
    }
    
    /**
     * Metodi kertoo, että onko laattaan osuttu vai ei
     * @return Boolean, joka on tosi kun laattaan ei vielä ole osuttu.
     */ 
    public boolean aktiivinen() {
        return aktiivinen;
    }
    
    @Override
    public void tormaa(Pallo pallo) {
        if (!aktiivinen) {
            return;
        }
        
        if (pallo.getX() >= x && pallo.getX() <= x + 50) {
            if (pallo.getY() >= y - 5 && pallo.getY() <= y) { //törmäys ylhäältä
                pallo.kaanny(true);
                aktiivinen = false;
            }    
            if (pallo.getY() >= y + 20 && pallo.getY() <= y + 25) { //törmäys alhaalta
                pallo.kaanny(true);
                aktiivinen = false;
            }
        }
        
        if (pallo.getY() >= y && pallo.getY() <= y + 20) {
            if (pallo.getX() >= x - 5 && pallo.getX() <= x) { //törmäys vasemmalta
                pallo.kaanny(false);
                aktiivinen = false;
            }
            if (pallo.getX() >= x + 50 && pallo.getX() <= x + 55) { //törmäys oikealta
                pallo.kaanny(false);
                aktiivinen = false;
            }
        }        
    }

    @Override
    public void paint(Graphics g) {
        if (!aktiivinen) {
            return;
        }
        
        g.setColor(vari);
        g.fillRect(x, y, 50, 20);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 50, 20);
    }

}
