package graphicsMock;

/**
 * Feikkigrafiikka, jota hyödynnetään piirtämisen testauksessa.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;

public class GraphicsMock extends Graphics{
    private ArrayList<Integer> koordinaatit;
    private Color vari;
    private int piirrot;
    private String viesti;
    public GraphicsMock(){
        this.koordinaatit = new ArrayList<>();
        piirrot = 0;
    }
    
    public String getViesti(){
        return viesti;
    }
    
    public int getPiirrot(){
        return piirrot;
    }
    
    public ArrayList<Integer> getKoordinaatit(){
        return koordinaatit;
    }
    
    @Override
    public Graphics create() {
        return this;
    }

    @Override
    public void translate(int i, int i1) {
        
    }

    @Override
    public Color getColor() {
        return vari;
    }

    @Override
    public void setColor(Color color) {
        this.vari = color;
    }

    @Override
    public void setPaintMode() {
       
    }

    @Override
    public void setXORMode(Color color) {
        
    }

    @Override
    public Font getFont() {
      return null;
    }

    @Override
    public void setFont(Font font) {
        
    }

    @Override
    public FontMetrics getFontMetrics(Font font) {
        return null;
    }

    @Override
    public Rectangle getClipBounds() {
        return null;
    }

    @Override
    public void clipRect(int i, int i1, int i2, int i3) {
   
    }

    @Override
    public void setClip(int i, int i1, int i2, int i3) {
   
    }

    @Override
    public Shape getClip() {
        return null;
    }

    @Override
    public void setClip(Shape shape) {
   
    }

    @Override
    public void copyArea(int i, int i1, int i2, int i3, int i4, int i5) {
    
    }

    @Override
    public void drawLine(int i, int i1, int i2, int i3) {
   
    }

    @Override
    public void fillRect(int i, int i1, int i2, int i3) {
        koordinaatit.add(i);
        koordinaatit.add(i1);
        koordinaatit.add(i+i2);
        koordinaatit.add(i1+i3);
        piirrot++;
    }

    @Override
    public void clearRect(int i, int i1, int i2, int i3) {
   
    }

    @Override
    public void drawRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {
   
    }

    @Override
    public void fillRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {
   
    }

    @Override
    public void drawOval(int i, int i1, int i2, int i3) {
  
    }

    @Override
    public void fillOval(int i, int i1, int i2, int i3) {
        koordinaatit.add(i);
        koordinaatit.add(i1);
        koordinaatit.add(i+i2);
        koordinaatit.add(i1+i3);     
        piirrot++;
    }

    @Override
    public void drawArc(int i, int i1, int i2, int i3, int i4, int i5) {
   
    }

    @Override
    public void fillArc(int i, int i1, int i2, int i3, int i4, int i5) {
    
    }

    @Override
    public void drawPolyline(int[] ints, int[] ints1, int i) {
     
    }

    @Override
    public void drawPolygon(int[] ints, int[] ints1, int i) {
    
    }

    @Override
    public void fillPolygon(int[] ints, int[] ints1, int i) {
        
    }

    @Override
    public void drawString(String string, int i, int i1) {
        this.viesti = string;
        piirrot++;
    }

    @Override
    public void drawString(AttributedCharacterIterator aci, int i, int i1) {

    }

    @Override
    public boolean drawImage(Image image, int i, int i1, ImageObserver io) {
        return true;
    }

    @Override
    public boolean drawImage(Image image, int i, int i1, int i2, int i3, ImageObserver io) {
        return true;
    }

    @Override
    public boolean drawImage(Image image, int i, int i1, Color color, ImageObserver io) {
        return true;
    }

    @Override
    public boolean drawImage(Image image, int i, int i1, int i2, int i3, Color color, ImageObserver io) {
        return true;
    }

    @Override
    public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ImageObserver io) {
        return true;
    }

    @Override
    public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, Color color, ImageObserver io) {
        return true;
    }

    @Override
    public void dispose() {
        
    }

}
