package kayttoliittyma;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import kentat.Kentta1;
import sovelluslogiikka.Blockeri;
import sovelluslogiikka.Lauta;
import sovelluslogiikka.Paivittaja;
import sovelluslogiikka.Pallo;

public class Kentta extends JPanel{
    private ArrayList<Blockeri> blockerit;
    private Pallo pallo;
    private Lauta lauta;
    private Paivittaja paivittaja;
    private Timer timer;
    private boolean paalla;
    
    public Kentta(){
        blockerit = Kentta1.luoBlockerit();
        pallo = new Pallo(250, 500, 1, -4);
        lauta = new Lauta(215);
        paivittaja = new Paivittaja(this);
        paalla = false;
        timer = new Timer();
        timer.scheduleAtFixedRate(paivittaja, 100, 12);
    }
    
    /**
     * Metodi aloittaa pelin/jatkaa peliä
     */
    public void start(){     
        paalla = true;
    }
    
    /**
     * Metodi keskeyttää pelin
     */
    public void pause(){
        paalla = false;
    }

    /**
     * Metodi kertoo, onko peli käynnissä
     * @return Boolean, joka kertoo, että onko peli käynnissä.
     */
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
