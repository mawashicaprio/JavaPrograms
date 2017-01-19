import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Twoinone implements ActionListener
{
  Frame f;
  Button b1,b2,b3;
  
  Twoinone(String s)
  {
    f =new Frame(s);
    
    b1=new Button("Red");
    b1.setBounds(40,100,100,50);
    b1.setBackground(Color.red);
    b1.addActionListener(this);
    f.add(b1);

    b2=new Button("Green");
    b2.setBounds(160,100,100,50);
    b2.setBackground(Color.green);
    b2.addActionListener(this);
    f.add(b2);

    b3=new Button("Blue");
    b3.setBounds(280,100,100,50);
    b3.setBackground(Color.blue);
    b3.addActionListener(this);
    f.add(b3);

    f.setSize(800,200);
    f.setLayout(null);
    f.setVisible(true);
}

   public void actionPerformed( ActionEvent be )
   { 
     if(be.getSource()==b1)
     {
       b1.setBackground(Color.green);
     }
     if(be.getSource()==b2)
     {
       b2.setBackground(Color.blue);
     }
     if(be.getSource()==b3)
     {
       b3.setBackground(Color.red);
     }
   }
   

  public static void main(String args[])
     {
   new Twoinone("TanishkGUI");
      }
}          
