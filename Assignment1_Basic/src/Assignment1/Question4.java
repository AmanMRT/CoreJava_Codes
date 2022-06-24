package Assignment1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//user input
		int num = sc.nextInt();
		
		//close scanner
		sc.close();
		
		//convert Integer to Binary
		String binary = Integer.toBinaryString(num);
		
		//result
		System.out.println(binary);
		
	}

}
