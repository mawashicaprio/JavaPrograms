import javax.swing.*;
import java.awt.event.*;

public class SenseM extends JFrame implements MouseListener
{

	public JLabel label;

	public static void main(String args[]) 
	{
		new SenseM();
	}

	SenseM() 
	{
		setSize(500, 400);
		setTitle("Java Swing - JFrame  Detect Mouse Events");

		label = new JLabel("No Mouse Event Captured", JLabel.CENTER);
		add(label);

		addMouseListener(this);
		setVisible(true);
	}


	public void mousePressed(MouseEvent e) 
	{
	   label.setText("Mouse Pressed");
	}
	
	public void mouseReleased(MouseEvent e)
	{
	    label.setText("Mouse Released");
	}
	
	public void mouseEntered(MouseEvent e) 
	{
	    label.setText("Mouse Entered");
	}
	
	public void mouseExited(MouseEvent e) 
	{
	    label.setText("Mouse Exited");
	}
	
	public void mouseClicked(MouseEvent e) 
	{
	    label.setText("Mouse Clicked");
	}
}