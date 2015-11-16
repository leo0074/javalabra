package sovelluslogiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import kentat.Kentta1;

public class Kentta extends JPanel{
    private ArrayList<Blockeri> blockerit;
    private Pallo pallo;
    private Lauta lauta;
    private Paivittaja paivittaja;
    private Timer timer;
    private boolean paalla;
    
    public Kentta(){
        blockerit = Kentta1.luoBlockerit();
        pallo = new Pallo(250, 500, 0, -4);
        lauta = new Lauta(215);
        paivittaja = new Paivittaja(this);
        timer = new Timer();
        paalla = false;
    }
    
    public void start(){     
        if(!paalla)
            timer.scheduleAtFixedRate(paivittaja, 100, 12);
        paalla = true;
    }
    
    public void pause(){
        paalla = false;
    }
    
    public boolean onPaalla(){
        return paalla;
    }
    
    public ArrayList<Blockeri> getBlockerit(){
        return blockerit;
    }
    
    public Lauta getLauta(){
        return lauta;
    }
    
    public Pallo getPallo(){
        return pallo;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Blockeri blockeri : blockerit){
            blockeri.paint(g);
        }
        pallo.paint(g);
        lauta.paint(g);
    }
    
}
