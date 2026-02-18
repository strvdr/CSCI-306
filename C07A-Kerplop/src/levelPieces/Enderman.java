package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import java.util.Random;
import gameEngine.Moveable;

/**
 * 
 *  *  * 
 * @author Strydr Silverberg
 * @author Kale Carlson
 *
 * Purpose: defining the enderman class and it's behaviour
 */
public class Enderman extends GamePiece implements Moveable{

	private String label = "teleports to random locations on the board";
	private int location;
	private char symbol = 'E';
	private boolean interactable = true;
	
	Random random = new Random();
	
	public Enderman(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Enderman() {
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
	
	// teleport the enderman to a random location on the board
	public void move(Drawable[] gameBoard, int playerLocation) {
		int nextMove = random.nextInt(gameBoard.length);
		gameBoard[this.getLocation()] = null;
		this.setLocation(nextMove);
		gameBoard[nextMove] = this;
	}
	
	// if player is to the left of enderman, take damage
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if( playerLocation == this.getLocation() - 1){
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
}
