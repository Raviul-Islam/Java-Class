import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TabbedPaneExample {
    JFrame f;

    TabbedPaneExample() {
        f = new JFrame();
        JTextArea ta = new JTextArea(200, 200);
        JPanel p1 = new JPanel();
        p1.add(ta);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 1000, 500);
        tp.add("main", p1);
        tp.add("visit", p2);
        tp.add("help", p3);
        f.add(tp);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}