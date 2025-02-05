package Vererbung;


public class Tiere  {

    protected String art;

    public Tiere(String art) {
        this.art = art;
    }

    public static void main(String[] args) {
        Hund h1 = new Hund("labrador","lucy","schwarz");
        h1.bellen();
        Dackel d1 = new Dackel("dackel","daisy", "braun", true, true, true);
        d1.bellen();
    }
}
