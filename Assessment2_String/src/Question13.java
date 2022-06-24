import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question13 {

	static void sort(String str)
	{
		//local variables
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		Arrays.sort(arr);	//sort
		
		for(int i=1; i<arr.length-1; i+=2)
			sb.append(arr[i]);
		
		System.out.println(sb);
	}
	public static void main(String[] args) {
	
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		try{
			
			System.out.print("Enter String: ");
			String str = sc.next();		//user input
			
			sort(str);
			
		} catch(NumberFormatException  | InputMismatchException e) {
			e.printStackTrace();
    	}
        
        sc.close();
	}
}
