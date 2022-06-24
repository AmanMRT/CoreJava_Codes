import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question9 {
	
	//Approach 1
	//letter by letter
//	static void toggle(String str)
//	{
//		char[] arr = str.toCharArray();
//		
//		try {
//			
//			for (int i=0; i<arr.length; i++)
//		    {
//		        if (arr[i]>='A' && arr[i]<='Z')
//		        	arr[i] = (char) (arr[i] + 'a' - 'A');
//		        else if (arr[i]>='a' && arr[i]<='z')
//		        	arr[i] = (char) (arr[i] + 'A' - 'a');
//		    }//end for
//		    
//		    //for each
//		    for(char c : arr)
//				   System.out.print(c);	
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//	}
	
	//Approach 1
	//using predefined method
	static void toggle(String str)
	{
		String result="";
		try {
			
			for(int i = 0; i < str.length(); i++)  {
				
					if(Character.isUpperCase(str.charAt(i))) {  
					result +=  Character.toLowerCase(str.charAt(i));
				}	else if(Character.isLowerCase(str.charAt(i))) {
					result +=  Character.toUpperCase(str.charAt(i));
				}	else { 
					result += str.charAt(i);
				}
			}
			
			System.out.println("\nBefore Toggling: " + str);
			System.out.println("\nAfter Toglinf: " + result);
			
		} catch (IndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}	
		
	}
	
	public static void main(String[] args) {
				
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		//user input
		try
		{
			System.out.print("Enter String: ");
			String str = sc.next();
			
			toggle(str);	//static method 
		
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();
	} 
}
