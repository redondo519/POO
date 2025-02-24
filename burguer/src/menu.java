import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {
    private JRadioButton polloRadioButton;
    private JRadioButton cerdoRadioButton;
    private JRadioButton terneraRadioButton;
    private JRadioButton veganaRadioButton;
    private JPanel panel1;
    private JRadioButton colaRadioButton;
    private JRadioButton naranjaRadioButton;
    private JRadioButton aguaRadioButton;
    private JRadioButton cervezaRadioButton;
    private JCheckBox hamburguesaDoble2€CheckBox;
    private JCheckBox extraDeQueso0CheckBox;
    private JCheckBox extraDePatatas1€CheckBox;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JSpinner spinner4;
    private JRadioButton limónRadioButton;
    private JRadioButton repartoADomicilioRadioButton;
    private JRadioButton recogidaEnLocal20RadioButton;
    private JButton calcularButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel panelH;

    public menu() {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        String nombreMenu = " ";

        polloRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                    double precio = 8;
                    String nombreMenu = "Pollo";
                System.out.println("precio"+ precio + " nombre " + nombreMenu);


            }
        });
        cerdoRadioButton.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                double precio = 8;
                String nombreMenu = "Cerdo";
                System.out.println("precio"+ precio + " nombre " + nombreMenu);
            }
        });

        terneraRadioButton.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                double precio = 8;
                String nombreMenu = "Ternera";
                System.out.println("precio"+ precio + " nombre " + nombreMenu);
            }
        });



        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

    }
    public static void main(String[] args) {
        new menu();
    }
}
