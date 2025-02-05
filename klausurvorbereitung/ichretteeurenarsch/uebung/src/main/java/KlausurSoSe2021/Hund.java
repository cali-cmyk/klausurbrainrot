package KlausurSoSe2021;

public class Hund extends  Tier {
    private boolean istBlindenHund;

    public Hund(String name, boolean istBlindenHund) {
        super(name); // --> nimmt name von tier
        this.istBlindenHund = istBlindenHund;
    }

    public void ausgeben(){

        System.out.println(istBlindenHund + "\n" + name);
        //printet beides
    }

    public static void main(String[] args) {
        Hund h1 = new Hund("motherfucker",false);
        h1.ausgeben();
        //erstellt neues objekt und testet methode
    }

    //last laufen für was lustiges hihihihihihi
}
