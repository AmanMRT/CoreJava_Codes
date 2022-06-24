package Assignment1;

import java.util.Scanner;

public class Question1 {

	//Driver Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//user input
		int num = sc.nextInt();
		
		//close scanner
		sc.close();	
		
		//for loop from 1 to 10
		for(int i=1; i<=10;i++)
			System.out.println(num + " X " + i + " = " + num*i);
	}
}
