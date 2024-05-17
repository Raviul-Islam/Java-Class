import java.awt.*;
import java.awt.event.*;

public class ContainerListenerExample extends Frame implements ContainerListener {
    public ContainerListenerExample() {
        setTitle("Container Listener Example");
        setSize(300, 200);
        // Adding a Panel to the Frame
        Panel panel = new Panel();
        panel.add(new Label("This is a panel"));
        add(panel);
        // Adding the ContainerListener to the Panel
        panel.addContainerListener(this);
        // Adding a WindowListener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    // Implementing ContainerListener methods
    public void componentAdded(ContainerEvent e) {
        System.out.println("Component added to the panel");
    }

    public void componentRemoved(ContainerEvent e) {
        System.out.println("Component removed from the panel");
    }

    public static void main(String[] args) {
        new ContainerListenerExample();
    }
}