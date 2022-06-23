package ObjectOrientedConcepts.Assignment3;

public class Novel extends Book {

	//class variable
	String novelAuthor;
		
	//parameterized constructor
	public Novel(int isbn, String title, String author, double price, String novelAuthor) {
		super(isbn, title, author, price);		//super constructor
		this.novelAuthor = novelAuthor;
	}

	//display Novel details
	public void displayNovelDetails() {
		System.out.println("Novel [novelAuthor=" + novelAuthor + ", isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]");
	}	
}

