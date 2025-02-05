package KlassenObjekte;

public class Auto {

    private String kennzeichen;
    private int tankinhalt;


    // Konstruktor mit Parametern
    public Auto(String kennzeichen, int tankinhalt) {
        this.kennzeichen = kennzeichen;
        this.tankinhalt = tankinhalt;
    }

    // Methode zum Hinzufügen von Tankinhalt
    public void tanken(int liter) {
        tankinhalt += liter;
    }

    // Methode zum Fahren und Verbrauch des Tankinhalts
    public void fahren(int verbrauch) {
        tankinhalt -= verbrauch;
    }

    // Methode zum Ausgeben der aktuellen Werte
    public void ausgeben() {
        System.out.println("Kennzeichen: " + kennzeichen);
        System.out.println("Tankinhalt: " + tankinhalt + " Liter");
    }

    public static void main(String[] args) {
        Auto a = new Auto("M-AB1234", 20);
        a.tanken(30);
        a.fahren(10);
        a.ausgeben();
    }
}
