package Assignment3_OOPS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {

	//class variables
	int isbn;
	String title;
	String author;
	double price;
	
	//parameterized constructor
	public Question1(int isbn, String title, String author, double price) {
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
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	//display book details
	public void displayDetails() {
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]");
	}
	
	public static void main(String[] args) {
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		try {
			
			//user input
			System.out.print("Enter Discount Percentage(%): ");
			int percent = sc.nextInt();
			
			//local variables
			//user input	
			System.out.print("Enter isbn code: ");
			int isbn = sc.nextInt();
			System.out.print("Enter Novel title: ");
			String title = sc.next();
			System.out.print("Enter author Name: ");
			String author = sc.next();
			System.out.print("Enter price: ");
			double price = sc.nextDouble();
			
			//object creation with new keyword
			Question1 book = new Question1(isbn, title, author, price);
			
			book.discount(percent);		//discount on the book
			book.displayDetails();		//display book details
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		//close scanner
		sc.close();	
	}
}
