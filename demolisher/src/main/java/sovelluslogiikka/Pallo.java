package sovelluslogiikka;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Luokka kuvaa kentällä esiintyvää palloa, jolla voi hajottaa laattoja ja joka
 * törmäilee esteisiin.
 */
public class Pallo {
    /**
     * Pallon keskipisteen x-koordinaatti
     */
    private int x; 
    /**
     * Pallon keskipisteen y-koordinaatti
     */
    private int y;
    /**
     * Pallon x suuntainen liikenopeus
     */
    private int dx; //pallon x-suunnan liikenopeus
    /**
     * Pallon y suuntainen liikenopeus
     */
    private int dy;
    /**
     * Laskurimuuttuja, jota kasvatetaan aina kun pallo liikkuu
     */
    private int kierros;
    /**
     * Muuttuja kertoo millä laskurimuuttujan arvolla pallo on viimeksi kääntynyt.
     */
    private int kaantynytViimeksi;
    public Pallo(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.kierros = 0;
        this.kaantynytViimeksi = -1;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }

    public int getDx() {
        return this.dx;
    }
    
    public int getDy() {
        return this.dy;
    }    
    
    public void setdx(int dx) {
        this.dx = dx;
    }
    
    public void setdy(int dy) {
        this.dy = dy;
    }    
    
    public int getKierros() {
        return this.kierros;
    }    
    
    /**
    * Asettaa pallon tilan seuraavalle kierrokselle. Oleellinen kun pallo osuu
    * kahteen laattaan yhtä aikaa ja jatkaisi ilman tätä matkaansa suoraan
    * eteenpäin
    */
    public void seuraavaKierros() {
        kierros++;
    }
    
    /**
    * Tarkistaa onko pallo mennyt pelikentän yli
    * @return boolean, joka on tosi kun pallo on ylittänyt kentän rajan.
    */
    public boolean tarkistaPelinLoppuminen() {
        return y >= 700;
    }
    
    /**
    * Metodi kääntää pallon suuntaan sen osuessa esteeseen
    * kuten pelikentän reunalle tai laattaan
    *@param   vaakatormays kertoo onko törmäys tapahtunut vaakasuoraan esteeseen
    */    
    public void kaanny(boolean vaakatormays) {
        if (kierros != kaantynytViimeksi) { 
            kierros = kaantynytViimeksi;
            if (vaakatormays) {
                dy = -dy;
            } else {
                dx = -dx;
            }
        }
    }
    
    /**
     * Metodi liikuttaa palloa yhden 'askeleen' pallon kulkusuuntaan
     */
    public void liiku() {
        x = x + dx;
        y = y + dy;
    }
    
    /**
     * Metodi piirtää pallon
     * @param g Graphics
     */
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x - 5, y - 5, 10, 10);
    }   
}
