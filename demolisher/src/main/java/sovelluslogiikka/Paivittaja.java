package sovelluslogiikka;

import kayttoliittyma.Kentta;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 * Luokka vastaa muutoksista, jotka tapahtuvat pallon liikkuessa ja sen törmätessä.
 * Lisäksi luokka laittaa kentän uudelleenpiirtämään näkymän. 
 */
public class Paivittaja extends TimerTask {
    private Pallo pallo;
    private ArrayList<Blockeri> blockerit;
    private Lauta lauta;
    private Kentta kentta;
    
    public Paivittaja(Kentta kentta) {
        setKentta(kentta);
    }

    public void setKentta(Kentta kentta) {
        this.blockerit = kentta.getBlockerit();
        this.lauta = kentta.getLauta();
        this.pallo = kentta.getPallo();
        this.kentta = kentta;        
    }
    
    /**
     * Setterimetodi testejä varten
     * @param blockerit lista blockereita
     */
    public void setBlockerit(ArrayList<Blockeri> blockerit){
        this.blockerit = blockerit;
    }
    
    /**
     * Poistaa tuhotut laatat listasta.
     */
    public void poistaDeaktiivisetLaatat() {
        ArrayList<Blockeri> poistot = new ArrayList<>();
        for(Blockeri blockeri:blockerit){
            if(blockeri.getClass().equals(Laatta.class)){
                Laatta laatta = (Laatta) blockeri;
                if(!laatta.aktiivinen()){
                    poistot.add(blockeri);
                }
            }
            
        }
        for(Blockeri blockeri : poistot){
            blockerit.remove(blockeri);
        }
        if(blockerit.size() == 1){
            kentta.kaikkiLaatatTuhottu();
        }
    }
    
    /**
     * Metodi käskee palloa liikkumaan, laudan siirtymään, tarkastuttaa pallon
     * osumisen esteisiin ja uudelleenpiirrättää kentän.
     */     
    @Override
    public void run() {
        this.poistaDeaktiivisetLaatat();
        if (kentta.onPaalla()) {
            pallo.seuraavaKierros();
            lauta.siirry();
            pallo.liiku();
            for (Blockeri blockeri: blockerit)
                blockeri.tormaa(pallo);
            lauta.tormaa(pallo);
            kentta.repaint();    
        } 
        if(pallo.tarkistaPelinLoppuminen()){
            kentta.lopetaPeli();
        }        
    }
}
