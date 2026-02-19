package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Creeper;
import levelPieces.Enderman;
import levelPieces.Skeleton;
import levelPieces.Zombie;
import levelPieces.Cow;
import levelPieces.Diamond;

public class TestInteractions {
	
	// creeperMoveTest performs testing of the creeper's interaction. It should blow up and kill you if you are a square away, but not damage 
	// at all if you are on the same square or two squares away
	@Test
	public void creeperInteractTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Creeper creeper = new Creeper(10);
		gameBoard[10] = creeper;
		assertEquals(InteractionResult.NONE, creeper.interact(gameBoard, 10));
		assertEquals(InteractionResult.KILL, creeper.interact(gameBoard, 9));
		assertEquals(InteractionResult.KILL, creeper.interact(gameBoard, 11));
		assertEquals(InteractionResult.HIT, creeper.interact(gameBoard, 12));
		assertEquals(InteractionResult.HIT, creeper.interact(gameBoard, 8));
		
		for(int i = 0; i < 8; i++) { 
			assertEquals(InteractionResult.NONE, creeper.interact(gameBoard, i));
		}
		for(int i = GameEngine.BOARD_SIZE - 1; i > 12 ; i--) { 
			assertEquals(InteractionResult.NONE, creeper.interact(gameBoard, i));
		}
	}
	
	// zombieMoveTest performs testing of the creeper's interaction. It should blow up and kill you if you are a square away, but not damage 
	// at all if you are on the same square or two squares away
	@Test
	public void zombieInteractTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Zombie zombie = new Zombie(10);
		gameBoard[10] = zombie;
		assertEquals(InteractionResult.HIT, zombie.interact(gameBoard, 10));
		
		for(int i = 0; i < 10; i++) { 
			assertEquals(InteractionResult.NONE, zombie.interact(gameBoard, i));
		}
		for(int i = GameEngine.BOARD_SIZE - 1; i > 10 ; i--) { 
			assertEquals(InteractionResult.NONE, zombie.interact(gameBoard, i));
		}
	}
	
	//skeletonMoveTest performs testing of the creeper's interaction. It should blow up and kill you if you are a square away, but not damage 
	// at all if you are on the same square or two squares away
	@Test
	public void skeletonInteractTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Skeleton skeleton = new Skeleton(10);
		gameBoard[10] = skeleton;
		int hits = 0;
		for(int i = 0; i < 200; i++) { 
			if(skeleton.interact(gameBoard, 7) == InteractionResult.HIT) {
				hits++;
			}
		}
		assert(hits > 50);
	}
	
	// endermanInteractTest performs testing of the endermans's interaction
	//if we are one square away, interaction should be a hit, else none
	 @Test
	public void endermanInteractTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Enderman enderman = new Enderman(10);
		gameBoard[10] = enderman;
			
		for(int i = 1; i <= GameEngine.BOARD_SIZE; i++) { 
			if(i != 9 && i != 11) {			
				assertEquals(InteractionResult.NONE, enderman.interact(gameBoard, i));
			} else {
				assertEquals(InteractionResult.HIT, enderman.interact(gameBoard, i));
			}
		}
	}
	 
	 // diamondInteractTest performs testing of the diamonds's interaction
	//if we are land on the diamond, we should advance
	@Test
	public void diamondInteractTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Diamond diamond = new Diamond(10);
		gameBoard[10] = diamond;
			
		for(int i = 1; i <= GameEngine.BOARD_SIZE; i++) { 
			if(i == 10) {			
				assertEquals(InteractionResult.ADVANCE, diamond.interact(gameBoard, i));
			} else {
				assertEquals(InteractionResult.NONE, diamond.interact(gameBoard, i));
			}
		}
	}
	
	 // cowInteractTest performs testing of the skeleton's interaction
	//if we land on a cow, we should receive a point
	@Test
	public void cowInteractTest() {
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Cow cow = new Cow(10);
		gameBoard[10] = cow;
			
		for(int i = 1; i <= GameEngine.BOARD_SIZE; i++) { 
			if(i == 10) {			
				assertEquals(InteractionResult.GET_POINT, cow.interact(gameBoard, i));
			} else {
				assertEquals(InteractionResult.NONE, cow.interact(gameBoard, i));
			}
		}
	}
}
