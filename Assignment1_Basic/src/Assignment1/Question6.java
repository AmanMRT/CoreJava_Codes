package Assignment1;

import java.util.Scanner;

public class Question6 {

	//static function to call without object creation
	public static void convertToSum(int num)
	{
		//local variable
		int sum = 0;
		
		//while loop
		while(num > 0)
		{
			int rem = num % 10;		//remainder
			sum += rem;				//sum + remainder
			num = num / 10;			//decrease number with mod by 10
		}
	
		System.out.println("The sum of all the digits entered is: " + sum);
	}
	
	//driver function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//user input
		int num = sc.nextInt();
		
		//close scanner
		sc.close();
		
		//static function
		Question6.convertToSum(num);

	}
}
