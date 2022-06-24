import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
	
	//Approach 1
	//reverses array in less number of swaps
	public static void reverseMethod1(int[] arr) 
	{
		int temp;
		int len = arr.length;
		
		try {
			
			for(int i=0; i<len/2;i++)
			{
				temp = arr[i];
				arr[i] = arr[len-i-1];
				arr[len-i-1] = temp;
			}
		} catch (IndexOutOfBoundsException e) {
						
			System.out.println(e);
		}
		
		//print array elements
		print(arr);
	}
	
//	//Approach 2
//	//reverses array and stores it in another array
//	public static void reverseMethod2(int[] arr)
//	{
//		//local variables
//		int len = arr.length;
//		int[] updated = new int[len];	//array declaration
//		int j = len;
//		
//		try {
//			for(int i=0; i<len/2;i++)
//			{
//				updated[j-1] = arr[i];
//				j--;
//			}
//		}catch (IndexOutOfBoundsException e) {
//						
//			System.out.println(e);
//		}
//		
//		//print array elements
//		print(arr);
//	}
//	
//	//Approach 3
//	//reverses array use the function java.util.Collections.reverse(List list) method
//	public static void reverseMethod3(int[] arr)
//	{
//		Collections.reverse(Arrays.asList(arr));
//		
//		//print array elements
//		print(arr);
//	}
//	
	//print array elements
	public static void print(int[] arr)  
	{
		//prints array elements
		System.out.println("After reverse");
		try {
			
			for(int i: arr)
				System.out.print(i+" ");
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
				
		System.out.println(); //new line
	}
	
	//Driver Method
	public static void main(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub
		
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		//local variables
		//user input
		try
		{
			System.out.print("Enter Array Size: ");
			int length = sc.nextInt();
			
			int[] arr = new int[length];
			
			System.out.print("Enter Array elements: ");
			for(int i=0;i<length;i++)
				arr[i] = sc.nextInt();
			
			reverseMethod1(arr);
			//reverseMethod2(arr);
			//reverseMethod3(arr);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		
		sc.close();
	}
}
