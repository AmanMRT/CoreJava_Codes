package JVMConceptsandLanguageBasics;

public class Assignment5 {

	//static function to call without object creation
	public static void convertToSum(int num)
	{
		//local variable
		int sum = 0;
		
		while(num > 0)
		{
			int rem = num % 10;		//remainder
			sum += rem;				//sum + remainder
			num = num / 10;			//decrease number with mod by 10
		}
	
		System.out.println("The sum of all the digits entered is: " + sum);
	}
	public static void main(String[] args) {
		
		int num = 3629;
		
		//static function
		Assignment5.convertToSum(num);

	}

}
