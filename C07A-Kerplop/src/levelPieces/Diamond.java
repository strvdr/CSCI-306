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
 ** Purpose: defining the diamond class and it's behaviour
 */
public class Diamond extends GamePiece {

	private String label = "Land on diamond to advance to next level";
	private int location;
	private char symbol = 'D';
	private boolean interactable = true;
	
	public Diamond(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Diamond() {
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
	
	// ifr player and diamond are overlapping, advance to next level
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if( playerLocation == this.getLocation()){
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
}
