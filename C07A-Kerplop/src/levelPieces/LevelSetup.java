package levelPieces;
import java.util.ArrayList;
import java.util.Random;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class LevelSetup implements Drawable {
	private Drawable[] board = new Drawable[20];
	private ArrayList<Moveable> movers = new ArrayList<Moveable>();
	private ArrayList<GamePiece> pieces = new ArrayList<GamePiece>(7);
	//private GamePiece[] pieces = {new Creeper(), new Enderman(), new Villager(), new Zombie(), new Skeleton(), new Diamond(), new Cow()};
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();
	
	public LevelSetup() {
		
	}

	public void createLevel(int num) {
		pieces.add(new Creeper());
		Random random = new Random(0xDEADBEEF * num);
		for(GamePiece piece: pieces) {
			int randomNum = random.nextInt(20);
			if(board[randomNum] == null) { 
				board[randomNum] = piece;
				piece.setLocation(randomNum);
			}
		}
	}
	
	public Drawable[] getBoard() {
		return board;
	}
	
	public ArrayList<Moveable> getMovingPieces() {
		for(GamePiece piece : pieces) { 
			if(piece instanceof Moveable) {
				movers.add((Moveable) piece);
			}
		}
		return movers;
	}
	
	public ArrayList<GamePiece> getInteractingPieces() {
		for(GamePiece piece : pieces) { 
			if(piece.getInteractable() != false) {
				interactingPieces.add(piece);
			}
		}
		return interactingPieces;

	}
	
	public void draw() {
	}
	
	public int getPlayerStartLoc() {
		return board.length / 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
