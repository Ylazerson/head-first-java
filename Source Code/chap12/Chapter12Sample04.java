import javax.swing.*;
import java.awt.*;


public class Chapter12Sample04 {

    public static void main (String[] args) {
       Chapter12Sample04 gui = new Chapter12Sample04();
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
          Image image =  new ImageIcon("torah.jpg").getImage();
          g.drawImage(image, 3, 4, this);
       }
    } // close inner class
} // close outer class

       
      

