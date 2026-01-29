
// More classes and objects.
public class Book {
	// Some internal attributes of a book.
	private int numPages;
	private int currentPage;
	
	// A constant, static so shared by all Book objects no 
	// matter how many your program makes.
	public static final int MAX_HIGHLIGHTS = 100;
	private int[] highlights;
	private int numHighlights;

	// Constructor. Note we instantiate the highlights array here.
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
		for (int i = 0; i < numHighlights; i++) {
			System.out.println("\t"+highlights[i]);
		}
	}	
	
	// Playing around with Book and its public methods.
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
