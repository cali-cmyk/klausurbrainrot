package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farbenfenster extends JFrame {
    private JPanel farbenfensterPanel;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel lieblingsFarbeLabel;
    private JComboBox lieblingsFarbecomboBox;
    private JButton auswaehlenButton;
    private JLabel preisLabel;
    private JTextField PreisTextField;

    public Farbenfenster(){
        setTitle("Farben Fenster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setContentPane(farbenfensterPanel);
        setVisible(true);
        auswaehlenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String farbe = lieblingsFarbecomboBox.getSelectedItem().toString();
                double preis = 0.0;

                switch (farbe){
                    case "rot": preis = 10.0; break;
                    case "gelb": preis = 15.0; break;
                    case "grün": preis = 15.0; break;
                    case "blau": preis = 17.0; break;

                }

                PreisTextField.setText(preis + " euro");

            }
        });
    }
    public static void main(String[] args) {
        new Farbenfenster();
    }
}
