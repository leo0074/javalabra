/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import graphicsMock.GraphicsMock;
import kayttoliittyma.Kentta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leo
 */
public class ViestiTest {
    
    public ViestiTest() {
    }

    @Test
    public void testaaAloitusViestinPiirtyminen() {
        Viesti viesti = new Viesti(new Kentta(0));
        GraphicsMock g = new GraphicsMock();
        viesti.paint(g);
        assertTrue(g.getViesti().equals("Aloita peli painamalla s"));
    }
    
    @Test
    public void testaaPelinAikainenViesti() {
        Kentta kentta = new Kentta(0);
        Viesti viesti = kentta.getViesti();
        GraphicsMock g = new GraphicsMock();
        kentta.start();
        viesti.paint(g);
        System.out.println(g.getViesti());
        assertTrue(g.getViesti().equals("Tarvittaeasse pysäytä peli painamalla p"));       
    }
    
    @Test
    public void testaaPauseViesti() {
        Kentta kentta = new Kentta(0);
        Viesti viesti = kentta.getViesti();
        GraphicsMock g = new GraphicsMock();
        kentta.start();
        kentta.pause();
        viesti.paint(g);
        System.out.println(g.getViesti());
        assertTrue(g.getViesti().equals("Jatka peliä painamalla s"));       
    }    
    
    
}
