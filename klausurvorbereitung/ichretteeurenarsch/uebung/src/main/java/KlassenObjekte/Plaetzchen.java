package KlassenObjekte;

public class Plaetzchen {

    //Attriubte

    private String namen;
    private String teigart;
    private String form;
    private int backzeit;
    private boolean ausstechen;


    //Konstruktor

    public Plaetzchen(String namen, String teigart, String form, int backzeit, boolean ausstechen) {
        this.namen = namen;
        this.teigart = teigart;
        this.form = form;
        this.backzeit = backzeit;
        this.ausstechen = ausstechen;
    }


    //Methoden

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void verringereBackzeit(int min){
        backzeit = backzeit - min;
    }
    public void ausgeben(){
        System.out.println("Plätzchenname: " + namen);
        System.out.println("Teigart " + teigart);
        System.out.println("Form: " + form);
        System.out.println("Backzeit: " + backzeit);
        System.out.println("Ausstechen?: " + ausstechen);
    }


    public static void main(String[] args) {
        Plaetzchen p = new Plaetzchen("keks", "schoko", "weihnachtsbaum", 11, true);

        p.setForm("Herzen");
        System.out.println(p.form);
        p.ausgeben();
    }
}
