import java.awt.*;

public class AWTExample1 extends Frame {
    AWTExample1() {
        Button b = new Button("Click me!");
        b.setBounds(30, 100, 80, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setTitle("This is our basic AWT example");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AWTExample1 f = new AWTExample1();
    }
}
