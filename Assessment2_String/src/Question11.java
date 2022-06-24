import java.util.InputMismatchException;
import java.util.Scanner;

public class Question11 {
	
	//Approach 1
	//Use StringBuilder
	public static String mixString(String leftStr, String rightStr) {
		
		StringBuilder sb = new StringBuilder();
		int larger = 0;
		
		if (leftStr.length() > rightStr.length()) 
			larger = leftStr.length();
		else 
			larger = rightStr.length();
		
		for (int i = 0; i<larger; i++) {
		
			if (i<leftStr.length())
				sb.append(leftStr.substring(i,i+1));
			if (i<rightStr.length()) 
				sb.append(rightStr.substring(i,i+1));
		}
		
	return sb.toString();
	}
	
	public static void main(String[] args)
	{
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		//user input
		try
		{
			System.out.print("Enter String One: ");
			String left = sc.next();
			System.out.print("Enter String Two: ");
			String right = sc.next();
			
			System.out.println(mixString(left, right));	//static method 
			
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();
	} 
}
