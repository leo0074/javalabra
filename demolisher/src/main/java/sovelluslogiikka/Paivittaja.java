
package sovelluslogiikka;

import kayttoliittyma.Kentta;
import java.util.ArrayList;
import java.util.TimerTask;

public class Paivittaja extends TimerTask{
    private Pallo pallo;
    private ArrayList<Blockeri> blockerit;
    private Lauta lauta;
    private Kentta kentta;
    
    public Paivittaja(Kentta kentta){
        this.blockerit = kentta.getBlockerit();
        this.lauta = kentta.getLauta();
        this.pallo = kentta.getPallo();
        this.kentta = kentta;
    }

    /**
     * Metodi käskee palloa liikkumaan, laudan siirtymään, tarkastuttaa pallon
     * osumisen esteisiin ja uudelleenpiirrättää kentän.
     */ 
    @Override
    public void run() {
        pallo.seuraavaKierros();
        if(!kentta.onPaalla()){
            return;
        }      
        lauta.siirry();
        pallo.liiku();
        for(Blockeri blockeri: blockerit)
            blockeri.tormaa(pallo);
        lauta.tormaa(pallo);
        kentta.repaint();
    }
}
