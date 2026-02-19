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

	public Diamond(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Diamond() {
		super('D', "Land on the diamond to advance to next level", 0, true);
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
		return 'D' + " - Land on the diamond to advance to next level";
	}
}
