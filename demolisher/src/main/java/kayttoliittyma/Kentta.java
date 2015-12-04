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
    /**
     * Lista esteistä
     */
    private ArrayList<Blockeri> blockerit;
    /**
     * Kentän pallo
     */
    private Pallo pallo;
    /**
     * Kentän lauta
     */
    private Lauta lauta;
    /**
     * Kentän päivittäjä
     */
    private Paivittaja paivittaja;
    /**
     * Muuttuja kertoo, että onko peli käynnissä
     */
    private boolean paalla;
    /**
     * Muuttuja kertoo, että onko pallo mennyt kentän yli
     */
    private boolean peliOhi;
    /**
     * Muuttuja kertoo, onko kenttä läpäisty
     */
    private boolean kenttaLapi;
    /**
     * Kentän viestiolio
     */
    private Viesti viesti;
    /**
     * Kenttään liittyvä pistelaskuri
     */
    private PisteLaskuri laskuri;
    /**
     * Kentän numero
     */
    private int kenttaNro;
    
    public Kentta(int kenttaNro) {
        alusta(kenttaNro);
    }
    
    
    /**
     * Alustaa kentän
     * @param kenttaNro alustettavan kentän numero 
     */
    public void alusta(int kenttaNro) {
        this.kenttaNro = kenttaNro;
        if (laskuri == null || peliOhi) {
            laskuri = new PisteLaskuri();
        }
        
        switch(kenttaNro) {
            case 0: {
                blockerit = TestiKentta.luoBlockerit(laskuri); 
                break;
            }
            case 1: {
                blockerit = Kentta1.luoBlockerit(laskuri); 
                break;
            }
            case 2: {
                blockerit = Kentta2.luoBlockerit(laskuri); 
                break;
            }            
        }         
        pallo = new Pallo(250, 500, 1, -4);
        lauta = new Lauta(215);
        paalla = false;
        peliOhi = false;
        kenttaLapi = false;
        viesti = new Viesti(this);
        if (paivittaja == null) {
            paivittaja = new Paivittaja(this);
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(paivittaja, 100, 12);  
        } else {
            paivittaja.setKentta(this);
            this.repaint();
        }   
    }
    
    public ArrayList<Blockeri> getBlockerit() {
        return blockerit;
    }
    
    public int getKenttaNro() {
        return this.kenttaNro;
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
    
    public boolean getPeliOhi() {
        return this.peliOhi;
    }
    
    public boolean kenttaVoitettu() {
        return this.kenttaLapi;
    }    
    
    /**
     * Metodi aloittaa pelin/jatkaa peliä
     */
    public void start() {     
        if (!peliOhi) {
            paalla = true;
            viesti.paivitaViesti();             
        }
    }
    
    /**
     * Metodi keskeyttää pelin
     */
    public void pause() {
        paalla = false;
        viesti.paivitaViesti();
    }

    /**
     * Metodi lopettaa pelin. Kutsutaan kun pallo on mennyt kentästä alas.
     */
    public void lopetaPeli() {
        peliOhi = true;
        paalla = false;
        viesti.lopetaPeli();    
    }
    
    
    /**
     * Metodi asettaa muuttujat vastaaman tilaa missä kaikki laatat ovat tuhottu   
    **/
    public void kaikkiLaatatTuhottu() {
        paalla = false;
        kenttaLapi = true;
        viesti.kenttaLapi();
        this.repaint();
    }
   
    /**
     * Metodi kertoo, onko peli käynnissä
     * @return Boolean, joka kertoo, että onko peli käynnissä.
     */
    public boolean onPaalla() {
        return paalla;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Blockeri blockeri : blockerit) {
            blockeri.paint(g);
        }
        laskuri.paint(g);
        pallo.paint(g);
        lauta.paint(g);
        viesti.paint(g);
    }
    
}