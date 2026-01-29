/*
 * Silly class used to illustrate git branching. 
 */
public class TheBrancher {
	private String theLeaf;
	private String theTree;
	
	public void makeATree() {
		theTree = "Aspen";
	}
	@Override
	public String toString() {
		return "TheBrancher [theLeaf=" + theLeaf + ", theTree=" + theTree + "]";
	}
	public void updateLeaf(String newLeaf) {
		theLeaf = newLeaf;
	}
	
	public void showLeaf() {
		System.out.println(theLeaf);
	}

	public static void main(String[] args) {
		TheBrancher brancher = new TheBrancher();
		brancher.updateLeaf("Turning yellow for fall");
		brancher.showLeaf();
		brancher.makeATree();
		System.out.println(brancher);
	}

}
