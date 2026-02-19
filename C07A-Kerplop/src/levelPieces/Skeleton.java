package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import java.util.Random;

/**
 * 
 *  *  * 
 * @author Strydr Silverberg
 * @author Kale Carlson
 *
 * Purpose: defining the Skeleton class and it's behaviour
 */
public class Skeleton extends GamePiece {

	public Skeleton(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Skeleton() {
		super('S', "Can shoot you from range(2 spots), doesn't shoot if you're close", 0, true);
	}
	
	public Skeleton(int location) {
		super('S', "Can shoot you from range(2 spots), doesn't shoot if you're close", location, true);
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	// if player is 2 spaces away from skeleton, take damage (might miss though)
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		Random random = new Random();
		if(playerLocation == this.getLocation() + 3 || playerLocation == this.getLocation() - 3){
			if(random.nextInt(2) == 0) {
			return InteractionResult.HIT;
			}
		} 
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return 'S' + " - Can shoot you from range(2 spots), doesn't shoot if you're close"; 
	}
}
