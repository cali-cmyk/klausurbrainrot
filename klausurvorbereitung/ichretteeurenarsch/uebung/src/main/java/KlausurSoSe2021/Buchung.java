package KlausurSoSe2021;






















public class Buchung {
    //attribute => die werte unseres objekts🥺
    private int anzahlPersonen;
    private int anzahlTage;
    private String verpflegung;

    //konstruktor ja genau der reserviert speicher bevor ein objekt erzeugt wird für das objekt
    public Buchung(int anzahlPersonen, int anzahlTage,  String verpflegung) {
        this.anzahlPersonen = anzahlPersonen;
        this.anzahlTage = anzahlTage;
        this.verpflegung = verpflegung;
    }

    //berechnet den gesamtpreis ( konnte man nicht vom namen der methode ablesen nein gar nicht )
    public double berechneGesamtPreis() {

        double grundPreis = 92.00; // --> der grundpreis pro übernachtung für eine person 👍  desweegen auch VOR der if- else- was auch immer aber KEINE schleife

        if (anzahlPersonen == 1 && anzahlTage ==1 ){ //  --> für denn fall dass man alleine bucht und lonely in seinem zimmer chillt und so
            grundPreis = grundPreis * 1.1;   //aufschlag von 10% --> 1.1 mal den grundpreis weil aufgabenstellung sagt wenn man alleine chillt 10% mehr
                                            // ( ist ein weg gegen die niedrige geburtenrate vorzugehen lol und einsamkeit vorzubeugen )
            switch (verpflegung) {
                // jede verpflegung hat nen anderen aufpreis deswegen das switch case könnte man auch mit if else if else machen
                case "Frühstück":
                    return grundPreis + 8;
                case "Halbpension":
                    return grundPreis + 24;
                case "Vollpension":
                    return grundPreis + 45;
            }

        }
        // wenn man W rizz hat und nicht alleine in hotel chillt checkt ihr
        else{
            switch (verpflegung){   // --> wieder verschiedene verpflegungen deswegen switch case
                                    //(nicht verwechseln mit glock wit a switch)
                case "Frühstück":
                    return grundPreis + 8*(anzahlPersonen+anzahlTage); // --> pro gyat & pro tag immer aufschlag von preis
                                                                        // einfach eine rizz tax😱
                case "Halbpension":
                    return grundPreis +24*(anzahlPersonen+anzahlTage);
                case "Vollpension":
                    return grundPreis + 45*(anzahlPersonen+anzahlTage);

            }



        }


        return  grundPreis; //  rizz tax die man zahlen muss weil man zu viel rizz hat oder nicht
    }

    public static void main(String[] args) {

        System.out.println("  _    _               _           _  _                                 _        _      _                         _                 _                         _  _              __                         _    _                        __ _                            _      _         \n" +
                "| |_ (_) _ __        | |_   __ _ | || |_  ___       _ __   __ _  _  _ | |      (_) __ | |_         _ __ __  ___ (_)             __| | __ _  ___ ___       __| |(_) ___        / _| ___  _ _  _ __   __ _ | |_ (_) ___  _ _  _  _  _ _  / _` |       __ _  ___ ___      (_) ___| |_       \n" +
                "|  _|| || '  \\       |   \\ / _` || ||  _|(_-/      | '  \\ / _` || || || |      | |/ _||   \\        \\ V  V // -_)| |            / _` |/ _` |(_-/(_-/      / _` || |/ -_)      |  _|/ _ \\| '_|| '  \\ / _` ||  _|| |/ -_)| '_|| || || ' \\ \\__. |      / _` |(_-/(_-/      | |(_-/|  _|      \n" +
                " \\__||_||_|_|_|      |_||_|\\__/_||_| \\__|/__/      |_|_|_|\\__/_| \\_._||_|      |_|\\__||_||_|        \\_/\\_/ \\___||_|            \\__/_|\\__/_|/__//__/      \\__/_||_|\\___|      |_|  \\___/|_|  |_|_|_|\\__/_| \\__||_|\\___||_|   \\_._||_||_||___/       \\__/_|/__//__/      |_|/__/ \\__|      \n");        // kleine überrachung an tim






        Buchung test = new Buchung(1,1, "Frühstück");       //1 person 1 tag --> kein rizz
                                                                                                // --> simulation von rizz oder nicht
        Buchung test2 = new Buchung (3,4,"Vollpension");        //3 personen 4 tage --> W rizz UND eine iced out roli flext wegen vollpension

        System.out.println("Der Gesamtpreis beträgt: " + "\n" + test.berechneGesamtPreis());
                                                                                                //berechnet rizz tax
        System.out.println("Der Gesamtpreis beträgt: " + "\n" + test2.berechneGesamtPreis());
    }
}


