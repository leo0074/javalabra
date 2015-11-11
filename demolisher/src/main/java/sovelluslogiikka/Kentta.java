package sovelluslogiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import kentat.Kentta1;

public class Kentta extends JPanel{
    private ArrayList<Blockeri> blockerit;
    private Pallo pallo;
    private Lauta lauta;
    public Kentta(){
        blockerit = Kentta1.luoBlockerit();
        pallo = Kentta1.luoPallo();
        lauta = new Lauta(215);
    }
    
    public ArrayList<Blockeri> getBlockerit(){
        return blockerit;
    }
    
    public Pallo getPallo(){
        return pallo;
    }
    
    @Override
    public void paintComponent(Graphics g){
        for(Blockeri blockeri : blockerit){
            blockeri.paint(g);
        }
        pallo.paint(g);
        lauta.paint(g);
    }
    
}
