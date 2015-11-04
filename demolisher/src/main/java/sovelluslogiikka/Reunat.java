package sovelluslogiikka;

import java.awt.Graphics;

public class Reunat implements Blockeri{

    public Reunat(){
        
    }
    
    
    /**
    * Metodi tutkii osuuko pallo pelikentän reunoille ja pyytää palloa
    * kääntämään kulkusuuntaansa, jos se osuu reunalle.
    *
    *@param   pallo   tutkittava pallo
    */
    
    @Override
    public void tormaa(Pallo pallo) {
        if(pallo.getX() <= 5 || pallo.getX() >= 495)
           pallo.kaanny();
        if(pallo.getY() <= 5 || pallo.getY() >= 695)
           pallo.kaanny();
    }

    @Override
    public void paint(Graphics g) {
        
    }

}
