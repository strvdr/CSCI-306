package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

/**
 * 
 *  *  * 
 * @author Strydr Silverberg
 * @author Kale Carlson
 *
 */
public abstract class GamePiece implements Drawable {
	// Interfaces cannot have instance variables
	protected char symbol;
	private String label ;
	// Stores the piece location, which will be needed to interact
	// with the player. 
	private int location;
	private boolean interactable;

	/**
	 * Constructor for the game piece
	 * 
	 * @param symbol  symbol for the game piece
	 * @param label TODO
	 * @param location initial location
	 */
	public GamePiece(char symbol, String label, int location, boolean interactable) {
		super();
		this.symbol = symbol;
		this.label = label ;
		this.location = location;
		this.interactable = interactable;
	}
	
	public GamePiece() { 
		super();
	}

	/**
	 * Draws the pieces symbol on the board
	 * 
	 * Abstract classes can have concrete/defined methods
	 * 
	 */
	public void draw() {
		System.out.print(symbol);
	}

	public boolean getInteractable() {
		return interactable;
	}

	/**
	 * 
	 * Abstract classes should have at least one abstract method
	 * 
	 * @param gameBoard
	 * @param playerLocation
	 * @return
	 */
	public abstract InteractionResult interact(Drawable [] gameBoard, int playerLocation);

	/**
	 * 
	 * @return piece's current location on board
	 */
	public int getLocation() {
		return location;
	}
	
	/**
	 * @param newLocation - location to place piece
	 */
	public void setLocation(int newLocation) {
		// Ensure the location remains on the board
		if (newLocation >= 0 && newLocation < GameEngine.BOARD_SIZE)
			location = newLocation;
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
	

}
