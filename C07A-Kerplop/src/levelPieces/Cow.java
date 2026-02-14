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
 * Purpose: defining the cow class and it's behaviour
 */
public class Cow extends GamePiece {

	private String label = "Land on cow to advance to collect a point";
	private int location;
	private char symbol = 'M';
	private boolean interactable = true;
	
	public Cow(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Cow() {
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
	
	
	// if cow and player are overlapping, add a point to player's counter
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if( playerLocation == this.getLocation()){
			gameBoard[this.getLocation()] = null;
			System.out.println("moo");
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
}
