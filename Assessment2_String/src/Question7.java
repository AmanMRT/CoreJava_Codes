import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 {
	
	static void split(String str)
	{
	    String[] arrSplit = str.split(" ");
	    
	    //smallest as 1st character of array
	    String small = arrSplit[0];
	    
	    for (int i=0; i<arrSplit.length; i++)
	    	if(small.length() > arrSplit[i].length())
	    		small = arrSplit[i];
	    
	    //print result
	    System.out.println(small);
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
			
			split(str);	//static method 
		
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();
	}

}
