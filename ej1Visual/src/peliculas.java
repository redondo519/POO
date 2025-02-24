import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class peliculas {
    private JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton añadirButton;



    public peliculas() {

        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.addItem(new String(textField1.getText()));
                textField1.setText("");
            }
        });
    }
    public static void main(String[] args) {
        new peliculas();
    }
}
