package levelPieces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class LevelSetup implements Drawable {
	private Drawable[] board = new Drawable[gameEngine.GameEngine.BOARD_SIZE];
	private ArrayList<Moveable> movers = new ArrayList<Moveable>();
	private ArrayList<GamePiece> pieces = new ArrayList<GamePiece>(7);
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();
	
	public LevelSetup() {
	}

	// adds all pieces for a given level, pieces chosen and their locations are determined by a set seed.
	public void createLevel(int num) {
		if(!pieces.isEmpty()){
			Arrays.fill(board, null);
			pieces.clear();
		}
		
		Random random = new Random(0x000A55 << num);
		
		board[random.nextInt(board.length)] = new Villager();
		
		pieces.add(new Cow());
		pieces.add(new Creeper());
		pieces.add(new Skeleton());
		pieces.add(new Zombie());
		pieces.add(new Enderman());
		pieces.add(new Cow());
		pieces.add(new Diamond());
		
		this.initialPrint(pieces);
		
		for(GamePiece piece: pieces) {
			
			// add moveable pieces to movers ArrayList
			if(piece instanceof Moveable){
				movers.add((Moveable) piece);
			}
			
			// add interactable pieces to interacting pieces ArrayList
			if(piece.getInteractable() != false) {
				interactingPieces.add(piece);
			}
			
			boolean filled = false;
			while(!filled){
				int randomNum = random.nextInt(20);
				if(board[randomNum] == null) { 
					board[randomNum] = piece;
					piece.setLocation(randomNum);
					filled = !filled;
				}
			}
		}
	}
	
	// prints symbol and labels for each game piece
	private void initialPrint(ArrayList<GamePiece> pieces) {
		for(GamePiece piece: pieces) {
			System.out.println(piece.toString());
		}
	}
	
	public Drawable[] getBoard() {
		return board;
	}
	
	public ArrayList<Moveable> getMovingPieces() {
		return movers;
	}
	
	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;

	}
	
	public void draw() {
	}
	
	//determines a random starting location for player
	public int getPlayerStartLoc() {
		return board.length / 2;
	}
}
