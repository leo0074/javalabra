package sovelluslogiikka;

import java.awt.Graphics;
import kayttoliittyma.Kentta;

/**
 *Luokka piirtää näkymän tilasta riippuvan viestin pelikentän alareunaan.
 */
public class Viesti {
    private String viesti;
    private Kentta kentta;
    public Viesti(Kentta kentta) {
        this.kentta = kentta;
        this.viesti = "Aloita peli painamalla s";
    }
    
    public String getViesti() {
        return this.viesti;
    }    
    
    /**
     * Metodi tarkistaa onko peli pysyäytetty ja päivittää viestin sen mukaisesti
     */
    public void paivitaViesti() {
        if (kentta.onPaalla()) {
            viesti = "Tarvittaeassa pysäytä peli painamalla p";
        } else {
            viesti = "Jatka peliä painamalla s";
        }
        
    }
    
    /**
     * Metodi asettaa viestin 'Game over!' kun sitä kutsutaan (kutsutaan pelin
     * loputtua)
     */
    public void lopetaPeli() {
        viesti = "Game over! Paina r aloittaaksesi uuden pelin";
    }
    
    /**
     * Metodi asettaa viestin kenttä läpäisty kun laatat on tuhottu
     */
    public void kenttaLapi() {
        viesti = "Kenttä läpäisty! Paina n siirtyäksesi seuraavaan kenttään";
    }
        
    
    /**
    * Metodi piirtää viestin kentälle.
    */
    public void paint(Graphics g) {
        g.drawString(viesti, 100, 600);
    }    
}
