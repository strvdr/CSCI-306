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

	public static final int DAMAGE = 1;
	private String label = "can only move left, will hit you if you land on him";
	private int location;
	private char symbol = 'Z';
	private boolean interactable = true;
	
	public Zombie(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Zombie() {
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
	
	// duplicate zombie instance one to the left and get rid of previous instance
	public void move(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() > 0) {
			gameBoard[this.getLocation()] = null;
			this.setLocation(this.getLocation() - 1);
			gameBoard[this.getLocation()-1] = this;
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
		return symbol + " - " + label ; 
	}
}
