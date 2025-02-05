package KlassenObjekte;

import java.util.Scanner;

public class Rechteck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("was soll berechnet werden");
        String operator = scanner.nextLine();

        switch (operator) {
            case "Umfang" -> System.out.println("Der Umfang des Rechtecks beträgt: " + Umfangberechnen() + "cm");
            case "A von Quadrat" ->
                    System.out.println("Der Flaecheninhalt des Quadrats beträgt: " + FlaechenInhaltBerechnen() + "cm²");
            case "Wurzel" -> System.out.println("Die wurzel der zahl betraegt: " + Wurzelberechnen());
        }



    }

    public static int Umfangberechnen() {
        int anzahlSeiten = 5;
        int[] seitenlaengen = new int[anzahlSeiten];
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i < anzahlSeiten; i++) {
            System.out.println("bitte seitenlänge "+ i +" "+ "in cm");
            seitenlaengen[i] = scanner.nextInt();

        }
        int Umfang =0;

       for(int i=0; i<anzahlSeiten; i++){
           Umfang += seitenlaengen[i];
       }
        return Umfang;
    }

    public static double FlaechenInhaltBerechnen(){
        int seiten = 3;
        int[] laenge = new int[seiten];
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i<seiten; i++){
            System.out.println("Bitte a und b angeben");
            laenge[i] = scanner.nextInt();

        }
        int flaecheninhalt = 0;

        for(int i = 1; i<seiten; i++){

        flaecheninhalt = laenge[i] * laenge[i];
        }
        return flaecheninhalt;
    }



    public static double Wurzelberechnen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte x angeben");
        double zahl = scanner.nextDouble();

        double ergebnis = 0;
        ergebnis= Math.sqrt(zahl);
        return ergebnis;

    }


}
