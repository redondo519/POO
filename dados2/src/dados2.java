import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class dados2 {
    private JPanel panel1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JTextField textField1;
    private JButton button1;







    public dados2() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Random rand = new Random();

                int num1 = Integer.parseInt(spinner1.getValue().toString());
                int num2 = Integer.parseInt(spinner2.getValue().toString());
                int r = rand.nextInt(num1,(num2+1));
                textField1.setText(String.valueOf(r));

            }
        });
    }

    public static void main(String[] args) {
        new dados2();
    }

}

