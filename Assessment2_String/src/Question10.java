import java.util.InputMismatchException;
import java.util.Scanner;

public class Question10 {

	static String leftRotate(String str)
	{
		str = str.substring(1) + str.substring(0,1);
		return "Clockwise Rotation: " + str;
	}
	
	static String rightRotate(String str)
	{
		str =  str.substring(str.length()-1) + str.substring(0,str.length()-1);
		return  "Anti-Clockwise Rotation: " + str;
	}
	public static void main(String[] args)
	{
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		//user input
		try
		{
			System.out.print("Enter String: ");
			String str = sc.next();
			str = str.trim();
			
			if(str.length() % 2 == 0)
				System.out.println(leftRotate(str));	//static method 
			else
				System.out.println(rightRotate(str));
			
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();		
	}
}
