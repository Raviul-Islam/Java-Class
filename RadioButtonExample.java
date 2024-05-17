import javax.swing.*;

public class RadioButtonExample {
    JFrame f;

    RadioButtonExample() {
        f = new JFrame();
        JRadioButton r1 = new JRadioButton("Child");
        JRadioButton r2 = new JRadioButton("Teenager");
        JRadioButton r3 = new JRadioButton("Adult");
        JRadioButton r4 = new JRadioButton("Old");

        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 75, 100, 30);
        r3.setBounds(75, 100, 100, 30);
        r4.setBounds(75, 125, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
