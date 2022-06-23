package ObjectOrientedConcepts.Assignment4;

public class creditCardPayment extends Payment
{
	//class variable
	String name;
	String expirationDate;
	double cardNumber;
	
	//parameterized constructor
	public creditCardPayment(String name, String string, double cardNumber) {
		super();
		this.name = name;
		this.expirationDate = string;
		this.cardNumber = cardNumber;
	}

	//display payment details
	public void paymentDetails()
	{
		System.out.println("name=" + name + ", expirationDate=" + expirationDate + ", cardNumber=" + cardNumber + " Mode of Payment:  CREDIT CARD ");
	}
}
