import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encuesta {
    private JRadioButton windowsRadioButton;
    private JRadioButton linuxRadioButton;
    private JRadioButton macRadioButton;
    private JCheckBox programacionCheckBox;
    private JCheckBox diseñoGráficoCheckBox;
    private JCheckBox administracionCheckBox;
    private JSlider slider1;
    private JPanel panel1;
    private JLabel label1;
    private JButton generarButton;

    public Encuesta() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Encuesta");
        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);


        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int n = slider1.getValue();
                label1.setText(String.valueOf(n));
            }
        });
        generarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sistema = "";
                String especialidad = "";
                String valor = "0";

                if (windowsRadioButton.isSelected()) {
                    sistema = "windows";
                } else if (linuxRadioButton.isSelected()) {
                    sistema = "linux";
                } else {
                    sistema = "mac";
                }

                if (programacionCheckBox.isSelected()) {
                    especialidad += " programacion ";
                }
                if (administracionCheckBox.isSelected()) {
                    especialidad += " administracion ";
                }
                if (diseñoGráficoCheckBox.isSelected()) {
                    especialidad += " diseño grafico ";
                }

                if (!label1.getText().equals("")) {
                    valor = label1.getText();
                }

                JOptionPane.showMessageDialog(frame, "Tu sisestema es  \n" + sistema +
                        "  tus especialidades son  " + especialidad + "  " +
                        "y el numero de horas dedicadas son " + valor + ".");


            }
        });
    }

    public static void main(String[] args) {
        new Encuesta();
    }

}
