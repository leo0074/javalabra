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
        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(vari);
        g.fillRect(x, y, x+50, y+20);        
    }

}
