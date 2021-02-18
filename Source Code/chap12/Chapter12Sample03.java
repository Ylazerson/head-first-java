import javax.swing.*;
import java.awt.*;


public class Chapter12Sample03 {

    public static void main (String[] args) {
       Chapter12Sample03 gui = new Chapter12Sample03();
       gui.go();
   }

   public void go() 
   {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       MyDrawPanel drawPanel = new MyDrawPanel();       

       frame.getContentPane().add(drawPanel);
       frame.setSize(300,300);
       frame.setVisible(true);
    
   }// close go() method


    class MyDrawPanel extends JPanel 
    {
    
       public void paintComponent(Graphics g) 
       {
          g.setColor(Color.green);
          g.fillRect(0, 0, this.getWidth(), this.getHeight());
          g.setColor(Color.blue);
          g.fillOval(3, 10, 40, 40);
       }
    } // close inner class
} // close outer class

       
      

