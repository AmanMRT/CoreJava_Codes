import java.util.InputMismatchException;
import java.util.Scanner;

public class Question6 {
	
	//Approach 1
	//using normal looping
//	public static void countCharacters(String str)
//	{
//		int upperCase = 0, lowerCase = 0;
//		String upperStr = "", lowerStr = ""; 
//	  
//		char[] ch = str.toCharArray();
//	  
//		for(char c : ch) 
//			if(c >='A' && c <='Z') { 
//				upperCase++;
//				upperStr += c;
//			}
//			else if (c >= 'a' && c <= 'z') {
//				lowerCase++;
//				lowerStr += c;
//			}
//			else 
//				continue;
//	    
//	    	print(lowerCase, lowerStr, upperCase, upperStr);
//	  	}
	
	//Approach2 
	//using inbuilt function
	public static void countCharacters(String str)
	{
		int upperCase = 0, lowerCase = 0;
		String upperStr = "", lowerStr = ""; 
		
	    for(int i=0; i<str.length(); i++)
			if(Character.isLowerCase(str.charAt(i))) {
				lowerCase++;
				lowerStr += str.charAt(i);
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				upperCase++;	
				upperStr += str.charAt(i);
			}
			 else 
				  continue;
	    
	    print(lowerCase, lowerStr, upperCase, upperStr);
	    
	}
	
	//print method
	public static void print(int lowerCase, String lowerStr, int upperCase, String upperStr)
	{
		  //Print count of lowercase and Upper Case
		  System.out.println("LowerCase Count: " + lowerCase + "\t UpperCase Count: " + upperCase);
		  
		  //condition
		  if(lowerCase == upperCase)
			  System.out.println("Equal Distribution");
		  else
			  System.out.print("\nLowerCase Characters: " + lowerStr + " \nUpperCase Characters: " + upperStr); 
	}
	
	//Driver Method
	public static void main(String[] args) {
	     
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		//local variables
		//user input
		try
		{
			System.out.print("Enter String: ");
			String str = sc.next();
			
			countCharacters(str);	//static method 
		
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();
	}
}
