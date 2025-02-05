package Vererbung;

public class Cabrio extends Auto{
    //Attribute

    private String farbeDach;
    private boolean dachelektrisch;

    //Konstruktor

    public Cabrio(String farbe, int motorleistung, int anzahlGaenge, String farbeDach, boolean dachelektrisch) {
        super(farbe, motorleistung, anzahlGaenge);
        this.farbeDach = farbeDach;
        this.dachelektrisch = dachelektrisch;
    }

   public void ausgeben(){
       super.ausgeben();
       System.out.println("Farbedach: " + farbeDach);
       System.out.println("Dach elektrisch: " + dachelektrisch);
   }
   public void hupen(){
        System.out.println("Röhr Röhr!");
   }
   public void dachOeffnen(){
       System.out.println("Dach ist jetzt offen.");
   }

    public static void main(String[] args) {
        Auto a1 = new Auto("rot", 215, 6);
        Cabrio c1 = new Cabrio("schwarz", 365,6,"schwarz",true);
        a1.hupen();
        c1.hupen();
    }
}
