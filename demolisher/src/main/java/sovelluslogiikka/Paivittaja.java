
package sovelluslogiikka;

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

    @Override
    public void run() {
        pallo.liiku();
        lauta.siirry();
        for(Blockeri blockeri: blockerit)
            blockeri.tormaa(pallo);
        lauta.tormaa(pallo);
        kentta.repaint();
    }
}
