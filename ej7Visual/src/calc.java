import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc {
    private JPanel Panel1;
    private JRadioButton sumatorioRadioButton;
    private JRadioButton productoRadioButton;
    private JRadioButton exponencialRadioButton;
    private JTextField textField1;
    private JTextField textField2;

    public calc() {
        sumatorioRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Integer.parseInt(textField1.getText());
                double numero2 = Integer.parseInt(textField2.getText());

                JFrame frame = new JFrame();
                frame.setContentPane(Panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

                if (sumatorioRadioButton.isSelected()) {

                    numero = numero + numero2;
                    textField1.setText(numero + "");
                }else if (productoRadioButton.isSelected()) {
                    numero = numero * numero2;
                    textField2.setText(numero + "");

                }else if (exponencialRadioButton.isSelected()) {
                    numero = Math.pow(numero,numero2);
                }
            }
        });
    }
    public static void main(String[] args) {
        new calc();
    }
}
