package ObjectOrientedConcepts.Assignment1;

public class Book {

	//class variables
	int isbn;
	String title;
	String author;
	double price;
	
	//parameterized constructor
	public Book(int isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//calculate the book price after discount
	public void discount(int percent)
	{
		price = price - (percent*price*0.01);
	}
	
	//display book details
	public void displayDetails() {
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int percent = 10;
		
		//object creation with new keyword
		Book book = new Book(123,"ABC","ABCDEF",1000);
		
		book.discount(percent);		//discount on the book
		book.displayDetails();		//display book details
		
	}
}
