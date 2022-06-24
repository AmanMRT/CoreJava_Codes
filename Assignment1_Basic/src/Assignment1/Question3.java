package Assignment1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//user input
		String str1 = sc.next();
		String str2 = sc.next();
		
		//close scanner
		sc.close();
		
		//convert integer to Binary with radix=2
		int num1 = Integer.parseInt(str1, 2);
		int num2 = Integer.parseInt(str2, 2);
		
		//convert Integer to Binary
		String sum = Integer.toBinaryString(num1 + num2);
		
		//result
		System.out.println("Sum of two binary numbers: " + sum);
	}

}
