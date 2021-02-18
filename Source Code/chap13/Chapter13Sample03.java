
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter13Sample03
{
    JTextArea textArea;
    JCheckBox checkBox;

	public static void main (String[] args)
	{
		Chapter13Sample03 gui = new Chapter13Sample03();
		gui.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();


		// Add button
		JButton button = new JButton("shock me");
		button.addActionListener(new ButtonListener());

        // Add textArea
		textArea = new JTextArea(20, 10);
		textArea.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);

        // Add checkBox
        checkBox = new JCheckBox("Are you happy?");
        checkBox.addItemListener(new CheckBoxListener());


		frame.getContentPane().add(BorderLayout.CENTER, panel);	
		frame.getContentPane().add(BorderLayout.SOUTH, button);	
		frame.getContentPane().add(BorderLayout.EAST, checkBox);

		frame.setSize(500, 500);
		frame.setVisible(true);
	}


    class ButtonListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            textArea.append("button clicked \n");
        }
    } // close inner class


    class CheckBoxListener implements ItemListener 
    {
        public void itemStateChanged(ItemEvent ev) 
        { 
    	    String onOrOff = "off"; 
    	    if (checkBox.isSelected()) onOrOff = "on"; 
    	    textArea.append(" Check box is " + onOrOff +" \n");
        }
    } // close inner class




}