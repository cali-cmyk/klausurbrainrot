package Vererbung;

public class Auto {
    protected String farbe;
    protected int motorleistung;
    protected int anzahlGaenge;

    //Konstruktor

    public Auto(String farbe, int motorleistung, int anzahlGaenge) {
        this.farbe = farbe;
        this.motorleistung = motorleistung;
        this.anzahlGaenge = anzahlGaenge;
    }

    //Methoden

    public void ausgeben(){
        System.out.println("farbe: "+ farbe);
        System.out.println("motorleistung: "+motorleistung + "PS");
        System.out.println("anzahlGaenge: " + anzahlGaenge);
    }

    public void hupen(){
        System.out.println("Tüt tüt!");
    }

}
