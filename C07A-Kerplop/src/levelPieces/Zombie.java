package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Player;
import gameEngine.Moveable;

/**
 * 
 *  *  * 
 * @author Strydr Silverberg
 * @author Kale Carlson
 *
 * Purpose: defining the zombie class and it's behaviour
 */
public class Zombie extends GamePiece implements Moveable{
	
	public Zombie(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Zombie() {
		super('Z', "can only move left, will hit you if you land on him", 0, true);
	}
	
	public Zombie(int location) {
		super('Z', "can only move left, will hit you if you land on him", location, true);
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	// duplicate zombie instance one to the left and get rid of previous instance
	public void move(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() > 0) {
			gameBoard[this.getLocation()] = null;
			this.setLocation(this.getLocation() - 1);
			gameBoard[this.getLocation()] = this;
		}
	}
	
	// if zombie and player are on same tile take a hit
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if( playerLocation == this.getLocation()){
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return 'Z' + " - Can only move left, will hit you if you land on him"; 
	}
}
