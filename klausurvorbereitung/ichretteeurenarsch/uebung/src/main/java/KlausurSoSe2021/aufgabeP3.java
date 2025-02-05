package KlausurSoSe2021;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class aufgabeP3 extends JFrame {

    private JPanel WaehrungPanel;
    private JLabel preisLabel;
    private JTextField eingabeEuroTextField;
    private JButton umrechnenButton;
    private JButton loeschenButton;
    private JLabel usDLabel;
    private JLabel rupeLabel;
    private JTextField dollarTextfield;
    private JTextField rupiahTextfield;

    public  aufgabeP3(){
        //selbst erklärend google übersetzer euer bester freund hier und sun bataev
        setTitle("Währungsrechner");
        setSize(1000,350);
        setContentPane(WaehrungPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        //Stasi (wer joke nicht checkt hört umrechnenButton ab )
        umrechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try{ // joa macht zeug und guckt dass er die berechneten zahlen einsetzen kann
               String text =  eingabeEuroTextField.getText();
                double euroBetrag = Double.parseDouble(text); // macht aus text ein double

               String dollar =  String.valueOf(berechneDollar());
               String rupiah =   String.valueOf(berechneRupiah());

               rupiahTextfield.setText(rupiah + " ₹");
               dollarTextfield.setText(dollar +" $");}


                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"kann nix bezahlen mit buchstabe oder sonderzeichen blyat");
                    // wenn eingabe irgendwas außer zahl frontet er dich
                }





            }
        });
        //löscht alle beweise von illegaler geldwäsche
        loeschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dollarTextfield.setText("");
                rupiahTextfield.setText("");
                eingabeEuroTextField.setText("");
            }
        });

    }

//berechnet wert für geld wäsche um mit amis zu verhandeln
    public String berechneDollar(){
        double umrechnungsWert = 0.90;
        String text = eingabeEuroTextField.getText();

        double dollarBetrag =  Double.parseDouble(text) *( 1.0/ umrechnungsWert);
        DecimalFormat df = new DecimalFormat("0.00"); //dieses cooles ding arbeitet nach dem japanischen sprichwort: 出る釘は打たれる
                                                            // „Der Nagel, der herausragt, wird eingeschlagen“ --> DecimalFormat als japaner schlägt dollarBetrag zurecht (2 nachkommatstellen)
        return df.format(dollarBetrag);

    }


    // genau dasselbe wie oben bloß für inder und pakistaner ( ich weiß nicht genau wo rupiah her kommt)
    public String berechneRupiah(){
        double umrechnungsWert = 0.00066;
        String text = eingabeEuroTextField.getText();

        double rupiahBetrag = Double.parseDouble(text) * (1.0/umrechnungsWert);
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(rupiahBetrag);

    }




    //erstellt neue geldwäsche
    public static void main(String[] args) {
        new aufgabeP3();
    }

}
