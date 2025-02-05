package KlassenObjekte;

public class Nudelgericht {

    private String name;
    private int grammNudeln;
    private double dauer;
    private boolean gesund;


    public Nudelgericht(String name, int grammNudeln, double dauer, boolean gesund) {
        this.name = name;
        this.grammNudeln = grammNudeln;
        this.dauer = dauer;
        this.gesund = gesund;
    }

    public void berechneZutaten(int portionen){
        portionen = grammNudeln/100;

    }

    public double schnellKochen(){
        dauer = dauer*0.75;
        return dauer;
    }
}
