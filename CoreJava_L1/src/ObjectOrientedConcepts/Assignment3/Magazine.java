package ObjectOrientedConcepts.Assignment3;

public class Magazine extends Book
{
	//class variable
	String type;
	
	//parameterized constructor
	public Magazine(int isbn, String title, String author, double price, String type) {
		super(isbn, title, author, price);		//super constructor
		this.type = type;
	}

	//display Magazine details
	public void displayMagazinelDetails() {
		System.out.println("Magazine [type=" + type + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", price="
				+ price + "]");
	}
}