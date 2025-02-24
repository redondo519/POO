import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dni {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel1;


    public dni() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setTitle("DNI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.pack();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero = textField1.getText();
                char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
                char letra = numero.charAt(numero.length() - 1);

                numero = numero.replaceAll(String.valueOf(letra), "");
                int pos = Integer.parseInt(numero) % 23;

                if (letras[pos] == letra){
                    JOptionPane.showMessageDialog(frame,"DNI correcto");
                    textField1.setText("");

                }else{
                    JOptionPane.showMessageDialog(frame,"DNI incorrecto");
                    textField1.setText("");
                }






            }
        });
    }
    public static void main(String[] args) {
        new dni();
    }
}
