
public class Book {
	private int numPages;
	private int currentPage;
	
	public static final int MAX_HIGHLIGHTS = 100;
	private int[] highlights;
	private int numHighlights;

	
	public Book(int numPages) {
		super();
		this.numPages = numPages;
		currentPage = 1;
		highlights = new int[MAX_HIGHLIGHTS];
	}

	public void turnThePage() {
		if (currentPage < numPages)
			currentPage++;
	}
	
	public void addHighlight() {
		if (numHighlights < MAX_HIGHLIGHTS) {
			highlights[numHighlights] = currentPage;
			numHighlights++;	
		}
	}
	public void printHighlights()  {
		System.out.println("Highlighted Pages");
		for (int i=0; i<numHighlights; i++)
			System.out.println("\t"+highlights[i]);
	}	
	public static void main(String[] args) {
		Book aBook = new Book(300);
		aBook.turnThePage();
		aBook.turnThePage();
		aBook.addHighlight();
		aBook.turnThePage();
		aBook.addHighlight();
		aBook.printHighlights();

	}

}
