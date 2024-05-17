import java.awt.*;    
import java.awt.event.*;    
// class which inherits Frame class and implements KeyListener interface  
public class KeyListenerExample extends Frame implements KeyListener {    
// creating object of Label class   and TextArea class  
 Label l;        TextArea area;    
    KeyListenerExample() {   // class constructor  
        l = new Label();      // creating the label  
        l.setBounds (20, 50, 100, 20);    // setting the location of the label in frame
        area = new TextArea();    // creating the text area  
        area.setBounds (20, 80, 300, 300); // setting the location of text area   
        area.addKeyListener(this);   // adding the KeyListener to the text area  
        add(l);  // adding the label and text area to the frame  
       add(area);    // setting the size, layout and visibility of frame  
       setSize (400, 400);        setLayout (null);            setVisible (true);        }    

public void keyPressed (KeyEvent e) {    // overriding the  method of KeyListener interface where we set the text of the label when key is pressed  
        l.setText ("Key Pressed");        }    
     public void keyReleased (KeyEvent e) {    
        l.setText ("Key Released");        }    
    public void keyTyped (KeyEvent e) {    
        l.setText ("Key Typed");        }    
    public static void main(String[] args) {    
        new KeyListenerExample();        }    }