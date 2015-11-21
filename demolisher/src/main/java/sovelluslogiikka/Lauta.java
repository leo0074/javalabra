package sovelluslogiikka;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

public class Lauta implements Blockeri{
    int x; //laudan vasemman osan x-koordinaatti
    int y; 
    public Lauta(int x){
        this.x = x;
        this.y = 550;
    }
    
    public int getX(){
        return x;
    }
    
    /**
     * Metodi siirtää laudan samaan x-koordinaatin kohtaan hiiren kanssa
     */
    public void siirry(){
        int x = haeHiirenX();
        if(x >= 45 && x  <= 455)
            this.x = x - 45;
    }
    
    /**
     * Metodi hakee hiiren x-koordinaatin
     * @return Hiiren x-koordinaatti
     */
    
    private int haeHiirenX(){
        PointerInfo hiiri = MouseInfo.getPointerInfo();
        return (int) hiiri.getLocation().getX();
    }
    
    /**
    * Metodi tutkii osuuko annettu pallo tähän lautaan ja kääntää pallon
    * suunnan, jos pallo osuu
    * @param pallo pallo, jonka törmäämistä tähän lautaan tutkitaan
    */    
    @Override
    public void tormaa(Pallo pallo) {
        if(pallo.getY() >= y-5 && pallo.getY() <= y){
            for(int k = 0; k <= 80; k = k+10){
                if(pallo.getX() >= x+k && pallo.getX() < x+k+10){
                    pallo.setdy(-4);
                    pallo.setdx(-4+(int)k/10);
                    break;
                }    
            }           
        }
    }

    /**
     * Metodi piirtää laudan
     * @param g Graphics 
     */  
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 90, 10);             
    }
}
