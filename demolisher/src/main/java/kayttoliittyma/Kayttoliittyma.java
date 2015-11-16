package kayttoliittyma;

import java.awt.Color;
import java.awt.Container;
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
        Container container = frame.getContentPane();
        Kentta kentta = new Kentta();
        container.add(kentta);
        frame.addKeyListener(new Nappaimisto(kentta));
        frame.setBackground(Color.WHITE);
        frame.pack();
        frame.setVisible(true); 
    }

}
