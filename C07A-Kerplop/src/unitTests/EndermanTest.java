package unitTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Enderman;

public class EndermanTest {

	// creeperMoveTest performs testing of the creeper's movement. It should blow up and kill you if you are a square away, but not damage 
		// at all if you are on the same square or two squares away
		@Test
		public void endermanMoveTest() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
			Enderman enderman = new Enderman(10);
			gameBoard[10] = enderman;
			
			for(int i = 0; i < GameEngine.BOARD_SIZE; i++) { 
				if(i != 9) {				
					assertEquals(InteractionResult.NONE, enderman.interact(gameBoard, i));
				} else {
					assertEquals(InteractionResult.HIT, enderman.interact(gameBoard, i));
				}
			}
		}
}
