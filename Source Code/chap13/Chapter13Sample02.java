
import javax.swing.*;
import java.awt.*;

class Chapter13Sample02
{
	public static void main (String[] args)
	{
		Chapter13Sample02 gui = new Chapter13Sample02();
		gui.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

        // change the panel’s layout manager from the default FlowLayout to BoxLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.setBackground(Color.darkGray);


		frame.getContentPane().add(BorderLayout.EAST, panel);		
		frame.setSize(300, 300);
		frame.setVisible(true);

		// Add button1
		JButton button1 = new JButton("shock me");
		panel.add(button1);

		// Add button2
		JButton button2 = new JButton("bliss");
		panel.add(button2);

	}
}