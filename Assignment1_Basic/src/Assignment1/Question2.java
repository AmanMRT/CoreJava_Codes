package Assignment1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//user input	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//close scanner
		sc.close();
		
		System.out.println("Before Swap: a = " + a + " b = " + b );
		
		//swap without 3rd variable
		a= a+b;
		b= a-b;
		a= a-b;
		
		//final result
		System.out.println("After Swap: a = " + a + " b = " + b );
		
	}

}
