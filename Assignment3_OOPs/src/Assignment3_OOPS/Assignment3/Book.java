package Assignment3_OOPS.Assignment3;

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
		try 
		{
			price = price - (percent*price*0.01);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	//display book details
	public void displayDetails() {
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]");
	}
}
