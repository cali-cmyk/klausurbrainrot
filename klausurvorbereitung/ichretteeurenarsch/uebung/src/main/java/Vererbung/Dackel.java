package Vererbung;

public class Dackel extends Hund{

    private boolean laenge;
    private boolean beine;
    private boolean schlappohren;

    public Dackel(String art, String name, String farbe, boolean laenge, boolean beine, boolean schlappohren) {

        super(art, name, farbe);
        this.laenge = laenge;
        this.beine = beine;
        this.schlappohren = schlappohren;
    }

    public void bellen(){
        System.out.println("wau wau");
    }
}
