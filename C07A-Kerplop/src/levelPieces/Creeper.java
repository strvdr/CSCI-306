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
 * Purpose: defining the Creeper class and it's behaviour
 */
public class Creeper extends GamePiece {

	public Creeper(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Creeper() {
		super('C', "Damages within two spaces, kills within 1", 0, true);
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	//if creeper is 1 space away from player kill player
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (playerLocation == this.getLocation() - 1 || playerLocation == this.getLocation() + 1){
			return InteractionResult.KILL;
		}
		if (playerLocation == this.getLocation() - 2 || playerLocation == this.getLocation() + 2){
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return 'C' + " - Damages within two spaces, kills within 1";
	}
}
