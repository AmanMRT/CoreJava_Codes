package Assignment3_OOPS.Assignment3;

import java.util.Scanner;

public class Assignment3Main
{	
	public static void main(String[] args) {
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
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
		System.out.print("Enter novelAuthor: ");
		String novelAuthor = sc.next();
				
		//object creation with new keyword
		Novel novel = new Novel(isbn, title, author, price, novelAuthor);
		novel.displayNovelDetails();				//display Novel details
		
		//user input	
		System.out.print("Enter isbn code: ");
		int isbncode = sc.nextInt();
		System.out.print("Enter Novel title: ");
		String mtitle = sc.next();
		System.out.print("Enter author Name: ");
		String mauthor = sc.next();
		System.out.print("Enter price: ");
		double mprice = sc.nextDouble();
		System.out.print("Enter type: ");
		String type = sc.next();
			
		
		//object creation with new keyword
		Magazine magazine = new Magazine(isbncode, mtitle, mauthor, mprice, type);
		magazine.displayMagazinelDetails();			//display Magazine details
		
		//close scanner
		sc.close();	
		
	}
}