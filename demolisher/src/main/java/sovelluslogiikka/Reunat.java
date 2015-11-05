package sovelluslogiikka;

/**
 * Reunaluokka, joka piirtää reunat ja tutkii, osuuko pallo pelikentän reunoille
 */

import java.awt.Graphics;

public class Reunat implements Blockeri{

    public Reunat(){
        
    }
    
    
    /**
    * Metodi tutkii osuuko pallo pelikentän reunoille ja pyytää palloa
    * kääntämään kulkusuuntaansa, jos se osuu reunalle.
    *
    *@param pallo tutkittava pallo
    */
    
    @Override
    public void tormaa(Pallo pallo) {
        if(pallo.getX() <= 5 || pallo.getX() >= 495)
           pallo.kaanny(false);
        if(pallo.getY() <= 5)
           pallo.kaanny(true);
    }

    @Override
    public void paint(Graphics g) {
        
    }

}
