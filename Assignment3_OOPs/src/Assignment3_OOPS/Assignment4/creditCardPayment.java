package Assignment3_OOPS.Assignment4;

public class creditCardPayment extends Payment
{
	//class variable
	String name;
	String expirationDate;
	long cardNumber;
	
	//parameterized constructor
	public creditCardPayment(String name, String expirationDate, long cardNumber) {
		super();
		this.name = name;
		this.expirationDate = expirationDate;
		this.cardNumber = cardNumber;
	}

	//display payment details
	public void paymentDetails()
	{
		System.out.println("name=" + name + ", expirationDate=" + expirationDate + ", cardNumber=" + cardNumber + " Mode of Payment:  CREDIT CARD ");
	}
}
