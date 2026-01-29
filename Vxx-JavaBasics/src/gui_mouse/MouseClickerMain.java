package gui_mouse;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MouseClickerMain {

	public static void main(String[] args) {
	    JFrame frame = new JFrame("Mouse Click Example");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    MouseClickerPanel panel = new MouseClickerPanel(6);
	    frame.add(panel, BorderLayout.CENTER);
	    frame.pack();
	    frame.setVisible(true);      
	}

}
