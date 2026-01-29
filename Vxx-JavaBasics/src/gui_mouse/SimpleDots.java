package gui_mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleDots extends JPanel {
	private ArrayList<Point> points;
	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	
	public SimpleDots() {
		points = new ArrayList<Point>();
		setBackground (Color.black); // BACKGROUND COLOR
		addMouseListener(new DotsListener()); // ADD LISTENER TO PANEL
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.cyan);
		// draws every point
		for (Point p : points) {
			g.fillOval(p.x, p.y, WIDTH, HEIGHT);
		}		
	}
	private class DotsListener implements MouseListener {
		//  Empty definitions for unused event methods.
		public void mousePressed (MouseEvent event) {}
		public void mouseReleased (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseExited (MouseEvent event) {}
		public void mouseClicked (MouseEvent event) {
			// update the list of points
			points.add(event.getPoint());  
			repaint(); // MUST CALL REPAINT
			
		}		
	}
	public static void main (String[] args) {
	      JFrame frame = new JFrame ("Dots");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(300, 200);
	      SimpleDots dots = new SimpleDots();
	      frame.add(dots, BorderLayout.CENTER);

	      frame.setVisible(true);	

	}
}
