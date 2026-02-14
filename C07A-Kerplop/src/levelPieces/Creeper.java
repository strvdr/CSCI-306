package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Player;

import java.util.Scanner;

/**
 * 
 *  *  * 
 * @author Mark Baldwin
 * @author Cyndi Rader
 *
 */
public class Creeper extends GamePiece {

	public static final int DAMAGE = 2;
	private String label = "damages within 2 spaces, kills within 1";
	private int location;
	private char symbol = 'C';
	private boolean interactable = true;
	
	public Creeper(char symbol, String label, int location, boolean interactable) {
		super(symbol, label, location, interactable);
		// TODO Auto-generated constructor stub
	}
	
	public Creeper() {
		// TODO Auto-generated constructor stub
	}

	public int getLocation() {
		return location;
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if( playerLocation == this.getLocation()){
			return InteractionResult.KILL;
		} else if (playerLocation == this.getLocation() - 1 || playerLocation == this.getLocation() + 1){
			return InteractionResult.HIT;
		}
		return null;
	}

	
}
