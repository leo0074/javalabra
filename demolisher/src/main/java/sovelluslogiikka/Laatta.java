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
    
    @Override
    public void tormaa(Pallo pallo) {
        if(pallo.getX() >= x && pallo.getX() <= x+50){
            if(pallo.getY() >= y-5 && pallo.getY() <= y) //törmäys ylhäältä
                pallo.kaanny(true);
            if(pallo.getY() >= y+20 && pallo.getY() <= y+25) //törmäys alhaalta
                pallo.kaanny(true);
        }
        if(pallo.getX() >= y && pallo.getX() <= y+20){
            if(pallo.getY() >= x-5 && pallo.getY() <= x) //törmäys vasemmalta
                pallo.kaanny(false);
            if(pallo.getY() >= x+50 && pallo.getY() <= x+55) //törmäys oikealta
                pallo.kaanny(false);
        }        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(vari);
        g.fillRect(x, y, x+50, y+20);        
    }

}
