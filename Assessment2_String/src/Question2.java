import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

//	public static int findSmallest(int[] arr, int num)
//	{
//		int smallest = 0;
//		Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length; i++)
//		{	
//			if(num == arr[i])
//				smallest = arr[i-1];
//			else
//				continue;
//		}
//		return smallest;
//	}
	
	//Driver Method
	public static void main(String[] args) {
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
			
			System.out.print("Enter Number to test: ");
			int number = sc.nextInt();
			
			int smallest = 0;
			Arrays.sort(arr);

			for(int i=0; i<arr.length-1; i++)
			{	
				//System.out.println(number + "   " + arr[i]);
				if(number > arr[i] && arr[i] <= arr[i+1])
					
				{	smallest = arr[i+1];
					
				}		
				
			}
			System.out.println(smallest);
			
		}catch (Exception e) {
		// TODO: handle exception
			System.out.println(e);
	}
	}
}
