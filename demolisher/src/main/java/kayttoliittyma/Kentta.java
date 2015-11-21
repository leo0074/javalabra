package kayttoliittyma;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import kentat.*;
import sovelluslogiikka.*;

/**
 * Luokka kokoaa pelissä olevat objektit ja tietää onko peli käynnissä vai ei.
 */
public class Kentta extends JPanel {
    private ArrayList<Blockeri> blockerit;
    private Pallo pallo;
    private Lauta lauta;
    private Paivittaja paivittaja;
    private Timer timer;
    private boolean paalla;
    private Viesti viesti;
    
    public Kentta(int kenttaNro) {
        switch(kenttaNro) {
            case 0: {
                blockerit = TestiKentta.luoBlockerit(); 
                break;
            }
            case 1: {
                blockerit = Kentta1.luoBlockerit(); 
                break;
            }
        }
          
        pallo = new Pallo(250, 500, 1, -4);
        lauta = new Lauta(215);
        paivittaja = new Paivittaja(this);
        paalla = false;
        viesti = new Viesti(this);
        timer = new Timer();
        timer.scheduleAtFixedRate(paivittaja, 100, 12);
    }
    
    /**
     * Metodi aloittaa pelin/jatkaa peliä
     */
    public void start() {     
        paalla = true;
        viesti.paivitaViesti(); 
    }
    
    /**
     * Metodi keskeyttää pelin
     */
    public void pause() {
        paalla = false;
        viesti.paivitaViesti();
        this.repaint();
    }

    /**
     * Metodi kertoo, onko peli käynnissä
     * @return Boolean, joka kertoo, että onko peli käynnissä.
     */
    public boolean onPaalla() {
        return paalla;
    }
      
    public ArrayList<Blockeri> getBlockerit() {
        return blockerit;
    }
    
    public Lauta getLauta() {
        return lauta;
    }
    
    public Pallo getPallo() {
        return pallo;
    }
    
    public Viesti getViesti() {
        return this.viesti;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Blockeri blockeri : blockerit) {
            blockeri.paint(g);
        }
        pallo.paint(g);
        lauta.paint(g);
        viesti.paint(g);
    }
    
}
