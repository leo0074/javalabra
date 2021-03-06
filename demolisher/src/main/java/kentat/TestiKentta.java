package kentat;

import java.awt.Color;
import java.util.ArrayList;
import sovelluslogiikka.*;

/**
 * Staattinen kentänluoja testejä varten 
 */
public class TestiKentta {
    
    public static ArrayList<Blockeri> luoBlockerit(PisteLaskuri laskuri) {
        ArrayList<Blockeri> blockerit = new ArrayList<>();
        blockerit.add(new Reunat());
        blockerit.add(new Laatta(0, 0, Color.BLUE, laskuri)); 
        blockerit.add(new Laatta(50, 0, Color.BLUE, laskuri)); 
        blockerit.add(new Laatta(100, 0, Color.BLUE, laskuri)); 
        return blockerit;
    }
    
}