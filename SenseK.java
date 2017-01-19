import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SenseK extends JFrame implements KeyListener
{
	

	public static void main(String args [])
	{	      
	  new SenseK();		
	}

	SenseK()
	{	    
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(300,300);
	    setTitle("JFrame Key Events");
	    setVisible(true);
	    addKeyListener(this);
	}

public void keyPressed(KeyEvent e)
{
    JOptionPane.showMessageDialog(this,
				  "Key Press Received",
				  "Pressed key: "+e.getKeyChar(),
				  JOptionPane.INFORMATION_MESSAGE);
}
public void keyReleased(KeyEvent e)
{
    JOptionPane.showMessageDialog(this,
				  "Key Release Received",
				  "Released key: "+e.getKeyChar(),
				  JOptionPane.INFORMATION_MESSAGE);
}
public void keyTyped(KeyEvent e)
{
    JOptionPane.showMessageDialog(this,
				  "Key Type Received",
				  "Typed key: "+e.getKeyChar(),
				  JOptionPane.INFORMATION_MESSAGE);
}

}