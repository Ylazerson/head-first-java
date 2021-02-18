
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter13Sample04
{
    JList list;

	public static void main (String[] args)
	{
		Chapter13Sample04 gui = new Chapter13Sample04();
		gui.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();


        // Add list
        String [] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"}; 
        list = new JList(listEntries);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListListener());

        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        listScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(listScroller);

		frame.getContentPane().add(BorderLayout.CENTER, panel);	

		frame.setSize(350, 300);
		frame.setVisible(true);
	}


    class ListListener implements ListSelectionListener  
    {
        public void valueChanged(ListSelectionEvent event) 
        {
            if (!event.getValueIsAdjusting())
            {
                String selection = (String) list.getSelectedValue();
                System.out.println(selection);   
            } 
        }
    } // close inner class


}