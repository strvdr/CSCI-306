package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Creeper;

class CreeperTest {

	// creeperMoveTest performs testing of the creeper's movement. It should blow up and kill you if you are a square away, but not damage 
	// at all if you are on the same square or two squares away
	@Test
	public void creeperMoveTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Creeper creeper = new Creeper(10);
		gameBoard[10] = creeper;
		assertEquals(InteractionResult.NONE, creeper.interact(gameBoard, 10));
		assertEquals(InteractionResult.KILL, creeper.interact(gameBoard, 9));
		assertEquals(InteractionResult.KILL, creeper.interact(gameBoard, 11));
		
		for(int i = 0; i < 9; i++) { 
			assertEquals(InteractionResult.NONE, creeper.interact(gameBoard, i));
		}
		for(int i = GameEngine.BOARD_SIZE - 1; i > 11 ; i--) { 
			assertEquals(InteractionResult.NONE, creeper.interact(gameBoard, i));
		}
	}
	
}