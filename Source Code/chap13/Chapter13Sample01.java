
import javax.swing.*;
import java.awt.*;

class Chapter13Sample01
{
	public static void main (String[] args)
	{
		Chapter13Sample01 gui = new Chapter13Sample01();
		gui.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.setBackground(Color.darkGray);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(200, 200);
		frame.setVisible(true);

		// Add button1
		JButton button1 = new JButton("shock me");
		panel.add(button1);

		// Add button2
		JButton button2 = new JButton("bliss");
		panel.add(button2);

	}
}