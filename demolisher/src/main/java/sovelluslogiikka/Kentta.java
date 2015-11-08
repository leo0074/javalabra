package sovelluslogiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import kentat.Kentta1;

public class Kentta {
    private ArrayList<Blockeri> blockerit;
    private Pallo pallo;
    public Kentta(){

    }
    
    public ArrayList<Blockeri> getBlockerit(){
        return blockerit;
    }
    
    public Pallo getPallo(){
        return pallo;
    }
    
    public void luo(int kenttaNro){
        blockerit = Kentta1.luoBlockerit();
        pallo = Kentta1.luoPallo();
    }
    
    public void paint(Graphics g){
        for(Blockeri blockeri : blockerit){
            blockeri.paint(g);
            pallo.paint(g);
        }
    }
    
}
