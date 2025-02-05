package KlausurSoSe2021;

public class Email {


    public static void main(String[] args) {
         String email = "j.ebernz@gmx.de"; //meine email bitte spammt nicht no cap no cap
         if(isreal(email)){                 // isreal NICHT Israel sonder is_real => ist real, valide whatever
             System.out.println("email is valid");
         }                                          //das erklär ich nicht ihr müsst das schon können
         else{
             System.out.println("not valid");
         }
    }

    public static boolean isreal(String email){
        return email.endsWith("de")  && email.indexOf("@") == email.lastIndexOf("@") && email.contains("@");
        //checkt ob email ein opp ist
        // ein opp ist eine mail ohne de hinten, wo @ mehr als einmal vor kommt oder gar nicht vorkommt.
        // dafür ist diese methode der opp stopper da mit den avengers endsWith ( endet mit) , indexOf && lastIndexOf (checkt ob @ nur einmal vorkommt)
        // & contains der checkt ob email das gang tatoo @ überhaupt hat

    }
}
