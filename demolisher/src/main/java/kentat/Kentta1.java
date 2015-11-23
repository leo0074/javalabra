package kentat;

import java.awt.Color;
import java.util.ArrayList;
import sovelluslogiikka.*;

/**
 * Ensimmäisen kentän luova staattinen luokka.
 */
public class Kentta1 {
    
    public static ArrayList<Blockeri> luoBlockerit(PisteLaskuri laskuri) {
        ArrayList<Blockeri> blockerit = new ArrayList<>();
        blockerit.add(new Reunat());
        for (int x = 0; x <= 450; x = x + 50) {
            blockerit.add(new Laatta(x, 0, Color.BLUE, laskuri)); 
        }
        for (int x = 0; x <= 450; x = x + 50) {
            blockerit.add(new Laatta(x, 20, Color.GREEN, laskuri)); 
        }
        return blockerit;
    }
    
}
