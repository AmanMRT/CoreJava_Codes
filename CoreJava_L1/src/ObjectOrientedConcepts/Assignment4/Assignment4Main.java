package ObjectOrientedConcepts.Assignment4;

public class Assignment4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation with new keyword
		cashPayment cash1 = new cashPayment(1000, "ABC1");
		cash1.paymentDetails();								//display payment details
		cashPayment cash2 = new cashPayment(1000, "ABC2");
		cash2.paymentDetails();								//display payment details
		
		//object creation with new keyword
		creditCardPayment credit1 = new creditCardPayment("PQR1", "01/01/21", 1010101001);
		credit1.paymentDetails();							//display payment details
		creditCardPayment credit2 = new creditCardPayment("PQR2", "02/02/21", 2020202002);
		credit2.paymentDetails();							//display payment details
		
	}
}
