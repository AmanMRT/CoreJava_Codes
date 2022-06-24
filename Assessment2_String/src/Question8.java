import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question8 {
	
	static void split(String str)
	{
	    String[] arrSplit = str.split(" ");
	    
	    for(int i=0; i<arrSplit.length; i++)
	    {
	    	System.out.println(arrSplit[i]);
	    }
	    
	    Arrays.sort(arrSplit);
	   	
	   // print(arrSplit);
	}
	
	//print array elements
  	public static void print(String[] arr)  
  	{	
  		try {
  			
  		   for(String s : arr)
  			   System.out.println(s);
  		   
  		} catch (ArrayIndexOutOfBoundsException e) {	  			
  			e.printStackTrace();
  		}
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
