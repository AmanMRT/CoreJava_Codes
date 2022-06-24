import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
	
	//Approach 1 without arraycopy
	public static void concat(int[] arr1, int[] arr2) {
       
		int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];

        int pos = 0;
        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }
        
        //print array
        print(result);	
    }
	
	//Approach 2 with arraycopy
	public static void concat2(int[] arr1, int[] arr2) {
		
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];

        System.arraycopy(arr1, 0, result, 0, len1);
        System.arraycopy(arr2, 0, result, len1, len2);

        //print array
        print(arr1);
    }
	
	//print array elements
  	public static void print(int[] arr)  
  	{
  		//prints matrix
  		try {
  			int len = arr.length;
  			
   	        for (int i = 0; i < len; i++)
   	        		System.out.print(i +" ");
   	        
  	      System.out.println(); //new line
  		} catch (IndexOutOfBoundsException e) {
  			  			
  			System.out.println(e);
  		}
  	}
  	
	public static void main(String[] args) 
	{
		//scanner class
    	Scanner sc = new Scanner(System.in);      
      
    	try
    	{
			//array 1 user input
	      	System.out.print("Enter Array1 Size: ");
			int length1 = sc.nextInt();
			
			int arr1[] = new int[length1];
			
			for(int i=0;i<length1;i++)
				arr1[i] = sc.nextInt();  
			
			//array 2 user input
			System.out.print("Enter Array2 Size: ");
			int length2 = sc.nextInt();
			
			int arr2[] = new int[length2];
			
			for(int i=0;i<length2;i++)
				arr2[i] = sc.nextInt();  
			
			concat(arr1, arr2);
			//concat2(arr1, arr2);
			
    	}catch(InputMismatchException | ArrayIndexOutOfBoundsException e)
    	{
    		e.printStackTrace();
    	}
        
        sc.close();
    }
}
