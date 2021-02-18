import javax.swing.*;

class Chapter12Sample01
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Click Me");

		frame.getContentPane().add(button);
		frame.setSize(300, 300);
        frame.setVisible(true);
	}
}