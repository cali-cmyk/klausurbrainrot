package KlassenObjekte;

public class Person {
        //Attribute

        private String name;
        private int geburtsjahr;
        private double groesse;
        private double gewicht;

        //Konstruktor

    public Person(String name, int geburtsjahr, double groesse, double gewicht) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }


    //Methoden


    public double berechneBMI(){

        return gewicht/(groesse * groesse);
    }

    public int berechneAlter(){

        int aktuellesJahr = 2024;
        return aktuellesJahr - geburtsjahr;
    }

    public static void main(String[] args) {
        Person p = new Person("sophie", 2002, 1.65, 60);
        System.out.println("BMI beträgt: " +p.berechneBMI());
        System.out.println("Alter: " + p.berechneAlter());
    }

}
