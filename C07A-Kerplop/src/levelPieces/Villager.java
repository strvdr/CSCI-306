package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Player;
/**
 * 
 *  *  * 
 * @author Strydr Silverberg
 * @author Kale Carlson
 *
 *	Purpose: defining the villager class and it's behaviour
 */
public class Villager implements Drawable {

	private String label = "Just sits there";
	private int location;
	private char symbol = 'V';
	private boolean interactable = false;
	
	public Villager() {
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int setLocation) {
		location = setLocation;
	}
	
	public boolean getInteractable() { 
		return interactable;
	}
	
	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
}
