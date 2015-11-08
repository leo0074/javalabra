package kentat;

import java.awt.Color;
import java.util.ArrayList;
import sovelluslogiikka.*;

public class Kentta1 {
    
    
    public static Pallo luoPallo(){
       return new Pallo(250, 500, 0, -4);
    }
    
    public static ArrayList<Blockeri> luoBlockerit(){
        ArrayList<Blockeri> blockerit = new ArrayList<>();
        blockerit.add(new Reunat());
        blockerit.add(new Laatta(0, 0, Color.BLUE));
        
        return blockerit;
    }
    
}
