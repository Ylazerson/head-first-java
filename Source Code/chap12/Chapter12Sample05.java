import javax.swing.*;
import java.awt.*;


public class Chapter12Sample05 {

    public static void main (String[] args) {
       Chapter12Sample05 gui = new Chapter12Sample05();
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
          Graphics2D g2d = (Graphics2D) g;

          GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange); 

          g2d.setPaint(gradient);
          g2d.fillOval(70, 70, 100, 100);
       }
    } // close inner class
} // close outer class

       
      

