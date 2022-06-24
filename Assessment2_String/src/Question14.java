import java.util.InputMismatchException;
import java.util.Scanner;

public class Question14 {

	static int calculateLength(String str)
	{
		int result = str.length() + ((int)str.charAt(str.length()-1)-64);
		return result;		
	}
	
	public static void main(String[] args) {
		
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		//user input
		try
		{
			System.out.print("Enter String: ");
			String str = sc.next();
			
			System.out.println(calculateLength(str));	//static method 
			
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();
	}
}
