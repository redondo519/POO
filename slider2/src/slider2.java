import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Random;

public class slider2 {
    private JTextField textField1;
    private JSlider slider1;
    private JPanel Panel1;

    public slider2() {
        JFrame frame = new JFrame();
        frame.setContentPane(Panel1);
        frame.setTitle("DNI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Random rand = new Random();
                int number = rand.nextInt(101);
                slider1.setValue(number);
                textField1.setText(String.valueOf(number));
            }
        });
    }
    public static void main(String[] args) {
        new slider2();
    }
}
