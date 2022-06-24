package Assignment3_OOPS.Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Email extends Document {

	//class variable
	String sender;
	String recipient;
	String title;
	
	//accessor for variable sender
	public String getSender() {
		return sender;
	}
	
	//mutator for variable sender
	public void setSender(String sender) {
		this.sender = sender;
	}

	//accessor for variable recipient
	public String getRecipient() {
		return recipient;
	}

	//mutator for variable recipient
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	//accessor for variable recipient
	public String getTitle() {
		return title;
	}

	//mutator for variable title
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", title=" + title + ", text=" + text+"]";
	}

	//Driver function
	public static void main(String[] args) {
					
		//scanner class
		Scanner sc = new Scanner(System.in);
		try
		{			
			//local variables
			//user input	
			System.out.print("Enter Sender's Name: ");
			String sender = sc.next();
			System.out.print("Enter Recipient's Name: ");
			String recipient = sc.next();
			System.out.print("Enter title: ");
			String title = sc.next();
			System.out.print("Enter text: ");
			String text = sc.next();			
			
			//object creation with new keyword
			Email email = new Email();
			
			//setting values with setter(mutator) method
			email.setText(text);			//set Text for Email
			email.setSender(sender);		//set Sender Name
			email.setRecipient(recipient);	//set Recipient Name
			email.setTitle(title);			//set Title for Email
			
			//Print to new line
			System.out.println(email.toString());
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		
		//close scanner
		sc.close();	
		
	}
}
