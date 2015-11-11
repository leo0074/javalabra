package kayttoliittyma;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import sovelluslogiikka.Kentta;

public class Kayttoliittyma implements Runnable{

    @Override
    public void run() {
        JFrame frame = new JFrame("Demolitionist");
        frame.setPreferredSize(new Dimension(500, 700));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(new Kentta());
        frame.setBackground(Color.WHITE);
        frame.pack();
        frame.setVisible(true); 
    }

}
