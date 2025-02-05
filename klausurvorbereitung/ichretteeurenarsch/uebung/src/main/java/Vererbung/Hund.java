package Vererbung;

public class Hund extends Tiere{

    private String name;
    private String farbe;

    public Hund(String art, String name, String farbe) {
        super(art);
        this.name = name;
        this.farbe = farbe;
    }

    public void bellen(){
        System.out.println("bell bell");
    }
}
