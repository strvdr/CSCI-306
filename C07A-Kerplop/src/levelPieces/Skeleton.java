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

	public static final int DAMAGE = 1;
	private String label = "can shoot you from range(2 spots), doesn't shoot if you're close";
	private int location;
	private char symbol = 'S';
	private boolean interactable = true;
	
	public Skeleton(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Skeleton() {
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
	
	// if player is 2 spaces away from skeleton, take damage
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		Random random = new Random();
		if(playerLocation == this.getLocation() + 3 || playerLocation == this.getLocation() - 3){
			if(random.nextInt(2) > 1) {
			return InteractionResult.HIT;
			}
		} 
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
}
