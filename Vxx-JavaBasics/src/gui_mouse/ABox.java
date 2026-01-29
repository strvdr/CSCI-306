package gui_mouse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

public class ABox {
	// constants to control drawing
	public static final int BOX_WIDTH = 100;
	public static final int BOX_HEIGHT = 200;
	public static final int BOX_MARGIN = 10;
	// id is automatically assigned, use a static variable to keep track
	private static int nextId = 1;
	// instance variables
	private Color color;
	private int id;
	// Store location to test mouse click
	private int x, y;
	
	public ABox(int x, int y) {
		this.x = x;
		this.y = y;
		setRandomColor();
		id = ABox.nextId;
		ABox.nextId++;
	}

	private void setRandomColor() {
		Random rand = new Random();
		int red = rand.nextInt(256);
		int blue = rand.nextInt(256);
		int green = rand.nextInt(256);
		color = new Color(red, green, blue);
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		g.setColor(Color.BLACK);
		g.drawString("Id-"+id, x+BOX_MARGIN, y+BOX_MARGIN);
	}	
	
	public boolean containsClick(int mouseX, int mouseY) {
		Rectangle rect = new Rectangle(x, y, BOX_WIDTH, BOX_HEIGHT);
		if (rect.contains(new Point(mouseX, mouseY))) 
			return true;
		return false;
	}
	public Color getColor() {
		return color;
	}	
}
