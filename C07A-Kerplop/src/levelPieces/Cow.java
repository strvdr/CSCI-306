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

	public Cow(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Cow() {	
		super('M', "Land on cow to collect a point", 0, true);
	}

	@Override
	public void draw() {
		System.out.print('M');
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
		return 'M' + " - Land on cow to collect a point"; 
	}
}
