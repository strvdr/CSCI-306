package chess;

abstract public class ChessPiece {
	private int row;
	private int col;
	
	public ChessPiece(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	
	abstract public void move();

}
