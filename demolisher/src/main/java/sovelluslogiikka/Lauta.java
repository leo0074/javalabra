package sovelluslogiikka;

import java.awt.Color;
import java.awt.Graphics;

public class Lauta implements Blockeri{
    int x; //laudan vasemman osan x-koordinaatti
    int y; 
    public Lauta(int x){
        this.x = x;
        this.y = 550;
    }

    @Override
    public void tormaa(Pallo pallo) {
        if(pallo.getY() >= y-5 && pallo.getY() <= y){
            for(int k = 0; k <= 80; k = k+10){
                if(pallo.getX() >= x+k && pallo.getDx() < x+k+10)
                    pallo.setdx(-4+(int)k/10);
            }           
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 90, 10);             
    }
}
