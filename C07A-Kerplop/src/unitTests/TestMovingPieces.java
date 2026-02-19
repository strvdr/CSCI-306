package unitTests;

import static org.junit.Assert.fail;

import org.junit.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Cow;
import levelPieces.Enderman;
import levelPieces.Zombie;

public class TestMovingPieces {
		// endermanRandomMovement performs testing of the creeper's movement. It should blow up and kill you if you are a square away, but not damage 
	 	// at all if you are on the same square or two squares away
	 	
		@Test
		public void endermanRandomMovement() {
			// Each test will create its own gameBoard
			Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
			// Start with 1, leaves 0 open
			for (int i=1;i<=5; i++)
				gameBoard[i] = new Cow();
			// Leave 6 open
			for (int i=7; i<=11; i++)
				gameBoard[i] = new Cow();
			// Leave 12, 13 and 20 open, assume player in 13
			for (int i=14; i<20; i++)
				gameBoard[i] = new Cow();
			// Place enderman in an open space - 6
			Enderman enderman = new Enderman(6);
			gameBoard[6] = enderman;
			int count0 = 0;
			int count6 = 0;
			int count12 = 0;
			int count20 = 0;
			for (int i=0; i<200; i++) {
				enderman.move(gameBoard, 13);
	
				int loc = enderman.getLocation();
				// ensure no other space is chosen
				if (loc != 0 && loc != 6 && loc != 12 && loc != 20)
					fail("Invalid square selected");
				// counters to ensure every valid option is chosen
				if (loc == 0) count0++;
				if (loc == 6) count6++;
				if (loc == 12) count12++;
				if (loc == 20) count20++;
			}
			// Ensure each option is randomly chosen some number of times. 
			assert(count0 > 20);
			assert(count6 > 20);
			assert(count12 > 20);
			assert(count20 > 20);		
		}

		// zombieMovement performs testing of the zombies's movement. Zombie only moves left, and always moves left. 
		// until it hits a wall at the far left of the board 	
		@Test
		public void zombieMovement() {
			Zombie zombie = new Zombie(GameEngine.BOARD_SIZE - 1);		
			Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
			gameBoard[10] = zombie;
			for (int i=GameEngine.BOARD_SIZE - 1; i >= 1; i--) {
				int oldLoc = zombie.getLocation();
				zombie.move(gameBoard, 13);
				int loc = zombie.getLocation();			
				assert(oldLoc - loc == 1);
			}
			
			// check if the zombie cannot move off the left of the game board
			int oldLoc = zombie.getLocation();
			zombie.move(gameBoard, 13);
			int loc = zombie.getLocation();	
			
			assert(oldLoc - loc == 0);
			
			
		}
}
