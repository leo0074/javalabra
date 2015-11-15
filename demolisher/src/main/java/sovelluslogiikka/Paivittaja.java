
package sovelluslogiikka;

import java.util.ArrayList;
import java.util.TimerTask;

public class Paivittaja extends TimerTask{
    private Pallo pallo;
    private ArrayList<Blockeri> blockerit;
    private Lauta lauta;
    
    public Paivittaja(Pallo pallo, ArrayList<Blockeri> blockerit, Lauta lauta){
        this.blockerit = blockerit;
        this.lauta = lauta;
        this.pallo = pallo;
    }

    @Override
    public void run() {
        pallo.liiku();
        for(Blockeri blockeri: blockerit)
            blockeri.tormaa(pallo);
        lauta.tormaa(pallo);
    }
}
