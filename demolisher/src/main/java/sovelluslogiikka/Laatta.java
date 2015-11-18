package sovelluslogiikka;

import java.awt.Color;
import java.awt.Graphics;

public class Laatta implements Blockeri{

    private int x; //koordinaatit osoittavan laatan oikeaan yläkulmaan
    private int y; //laatan koko on 50x20
    private Color vari; //laatan väri
    
    public Laatta(int x, int y, Color vari){
        this.x = x;
        this.y = y;
        this.vari = vari;
    }
    
    
    /**
    * Metodi tutkii osuuko annettu pallo tähän laattaan ja kääntää pallon
    * suunnan, jos pallo osuu
    * @param pallo pallo, jonka törmäämistä tähän laattaan tutkitaan
    */
    @Override
    public void tormaa(Pallo pallo) {
        if(pallo.getX() >= x && pallo.getX() <= x+50){
            if(pallo.getY() >= y-5 && pallo.getY() <= y) //törmäys ylhäältä
                pallo.kaanny(true);
            if(pallo.getY() >= y+20 && pallo.getY() <= y+25) //törmäys alhaalta
                pallo.kaanny(true);
        }
        
        if(pallo.getY() >= y && pallo.getY() <= y+20){
            if(pallo.getX() >= x-5 && pallo.getX() <= x) //törmäys vasemmalta
                pallo.kaanny(false);
            if(pallo.getX() >= x+50 && pallo.getX() <= x+55) //törmäys oikealta
                pallo.kaanny(false);
        }        
    }

    /**
     * Metodi piirtää laatan
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(vari);
        g.fillRect(x, y, 50, 20);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 50, 20);
    }

}
