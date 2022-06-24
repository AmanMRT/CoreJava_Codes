package Assignment1;

import java.util.Scanner;

public class Question10 {
		
	public static int factorial(int n) {
	    if (n == 0)
	        return 1;
	    else {
	        int newVal = n*factorial(n-1);
	       
	        System.out.println(newVal);
	        return newVal;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner class
	    Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		factorial(num);
		
		sc.close();
			
	}
}
