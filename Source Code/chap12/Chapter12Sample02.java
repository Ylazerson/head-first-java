import javax.swing.*;
import java.awt.event.*;

class Chapter12Sample02 implements ActionListener
{
    // instance variable
	JButton button;


	// -- ---------------------------------------------------------------
	public static void main(String[] args)
	{
        Chapter12Sample02 gui = new Chapter12Sample02();
        gui.go();
	}	
    // -- ---------------------------------------------------------------


    // -- ---------------------------------------------------------------
	public void go()
	{
		// create the frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialize the button and add to pane
		button = new JButton("Click Me");

		frame.getContentPane().add(button);
		frame.setSize(300, 300);
        frame.setVisible(true);

        // let the button know you're listening
        button.addActionListener(this);
    }
    // -- ---------------------------------------------------------------


    // -- ---------------------------------------------------------------    
    // implement actionPerformed - this is the method the button will call on you when it's clicked
    public void actionPerformed(ActionEvent event)
    {
      	button.setText("I've been clicked");
    }
	// -- ---------------------------------------------------------------
}