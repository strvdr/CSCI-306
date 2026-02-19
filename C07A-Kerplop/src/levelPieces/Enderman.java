package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
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

	Random random = new Random();
	
	public Enderman(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
	}
	
	public Enderman() {
		super('E', "teleports to a random location on the board", 0, true);
	}
	
	public Enderman(int location) {
		super('E', "teleports to a random location on the board and hits on spaces adjacent to it", location, true);
	}

	@Override
	public void draw() {
		System.out.print('E');
	}
	
	// teleport the enderman to a random location on the board
	public void move(Drawable[] gameBoard, int playerLocation) {
		int nextMove;
		int attempts = 0;
		do {	
			nextMove = random.nextInt(GameEngine.BOARD_SIZE);
			attempts++;
		} while(attempts <= GameEngine.BOARD_SIZE && (gameBoard[nextMove] != null || nextMove == playerLocation));
		
		if(attempts <= GameEngine.BOARD_SIZE){
			gameBoard[this.getLocation()] = null;
			this.setLocation(nextMove);
			gameBoard[nextMove] = this;
		}
	}
	
	//if player is to the left or right of enderman, take damage
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation == this.getLocation() - 1 || playerLocation == this.getLocation() + 1){
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	
	@Override
	public String toString() {
		return 'E' + " - teleports to random locations on the board"; 
	}
}
