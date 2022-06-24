package Assignment3_OOPS.Assignment4;

import java.util.Scanner;

public class Assignment4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//local variables
		//user input for cashpayment
		
		//USER1
		System.out.print("Enter Amount: ");
		float amount1 = sc.nextFloat();
		System.out.print("Enter Name: ");
		String name1 = sc.next();
		
		//USER2
		System.out.print("Enter Amount: ");
		float amount2 = sc.nextFloat();
		System.out.print("Enter Name: ");
		String name2 = sc.next();
						
		//object creation with new keyword
		cashPayment cash1 = new cashPayment(amount1, name1);
		cash1.paymentDetails();								//display payment details
		cashPayment cash2 = new cashPayment(amount2, name2);
		cash2.paymentDetails();								//display payment details
		
		//user input for creditcard	
		
		//USER1
		System.out.print("Enter Name: ");
		String name21 = sc.next();
		System.out.print("Enter expirationDate(dd/mm/yy): ");
		String date1 = sc.next();
		System.out.print("Enter CardNumber: ");
		long cardno1 = sc.nextLong();
		
		//USER2
		System.out.print("Enter Name: ");
		String name22 = sc.next();
		System.out.print("Enter expirationDate(dd/mm/yy): ");
		String date2 = sc.next();
		System.out.print("Enter CardNumber: ");
		long cardno2 = sc.nextLong();

		//object creation with new keyword
		creditCardPayment credit1 = new creditCardPayment(name21, date1, cardno1);
		credit1.paymentDetails();							//display payment details
		creditCardPayment credit2 = new creditCardPayment(name22, date2, cardno2);
		credit2.paymentDetails();							//display payment details
	
		//close scanner
		sc.close();	
	}
}
