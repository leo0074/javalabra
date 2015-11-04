package sovelluslogiikka;

public class Pallo {
    private int x; //koordinaatit osoittavat pallon keskipisteeseen.
    private int y; //pallon halkaisija on tässä pelissä 10 pikseliä
    private int dx;
    private int dy;
    
    public Pallo(int x, int y, int dx, int dy){
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void kaanny(){
        
    }
    
}
