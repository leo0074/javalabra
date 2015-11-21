package sovelluslogiikka;

import java.awt.Graphics;
import kayttoliittyma.Kentta;

public class Viesti {
    private String viesti;
    private Kentta kentta;
    public Viesti(Kentta kentta){
        this.kentta = kentta;
        this.viesti = "Aloita peli painamalla s";
    }
    
    /**
     * Metodi tarkistaa onko peli pysyäytetty ja päivittää viestin sen mukaisesti
     */
    public void paivitaViesti(){
        if(kentta.onPaalla()){
            viesti = "Tarvittaeasse pysäytä peli painamalla p";
        }else{
            viesti = "Jatka peliä painamalla s";
        }
        
    }
    
    public void paint(Graphics g) {
        g.drawString(viesti, 180, 600);
    }    
}
