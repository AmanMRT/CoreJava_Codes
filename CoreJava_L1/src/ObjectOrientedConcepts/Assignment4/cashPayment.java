package ObjectOrientedConcepts.Assignment4;

public class cashPayment extends Payment
{
	//class variable
	float cashAmount;
	String name;
	
	//parameterized constructor
	public cashPayment(float cashAmount, String name) {
		super();
		this.cashAmount = cashAmount;
		this.name = name;
	}
	
	//display payment details
	public void paymentDetails()
	{
		System.out.println("cashAmount=" + cashAmount + ", name=" + name + " Mode of Payment:  CASH ");
	}
}