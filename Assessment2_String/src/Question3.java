import java.util.Scanner;

public class Question3
{      
    //Approach 1 
	//Transpose using 2 matrix
    public static void transpose(int arr1[][], int arr2[][])
    {
    	try 
    	{
    		int len = arr1.length;
 	       
 	       	for (int i = 0; i < len; i++)
 	       		for (int j = 0; j < len; j++)
 	       			arr2[i][j] = arr1[j][i];
 	       	
		} catch (IndexOutOfBoundsException e) {
  			
  			System.out.println(e);
  		}
    }
    
    //Approach 2
    //Using 1 matrix only
//    public static void transpose(int arr1[][])
//    {
//    	try 
//    	{
//    		int len = arr1.length;
// 	       
// 	       	for (int i = 0; i < len; i++)
// 	       		for (int j = 0; j < len; j++)
// 	       		{
// 	       			//swap
// 	       			int temp = arr1[i][j];
// 	       			arr1[i][j] = arr1[j][i];
// 	       			arr1[j][i] = temp;
// 	       		}
//    	} catch (IndexOutOfBoundsException e) {
//  			
//  			System.out.println(e);
//  		}
//    }
    
    //Approach 3 for rectangular matrix
//    public static void transpose(int arr1[][], int arr2[][])
//    {
//    	try 
//    	{
//    		int len1 = arr1.length;
//    		int len2 = arr2.length;
//       
//        for (int i = 0; i < len1; i++)
//            for (int j = 0; j < len2; j++)
//                arr2[i][j] = arr1[j][i];
//        
//    	} catch (IndexOutOfBoundsException e) 
//    	{
//  			
//  			System.out.println(e);
//  		}	
//    }
    
    
    //print array elements
  	public static void print(int[][] arr)  
  	{
  		//prints matrix
  		try {
  			int len = arr.length;
  			
   	        for (int i = 0; i < len; i++)
  	        {
  	            for (int j = 0; j < len; j++)
  	            System.out.print(arr[i][j] + " ");
  	            System.out.print("\n");
  	        }
  	      System.out.println(); //new line
  		} catch (IndexOutOfBoundsException e) {
  			  			
  			System.out.println(e);
  		}
  	}
  	
    // Driver code
    public static void main (String[] args)
    {
    	//scanner class
    	Scanner sc = new Scanner(System.in);      
      
    	try
    	{
	      	System.out.print("Enter Array Size: ");
			int length = sc.nextInt();
			
			int arr1[][] = new int[length][length];
			int arr2[][] = new int[length][length];
			
			System.out.print("Enter Array elements: ");
			for(int i=0;i<length;i++)
				for(int j=0;j<length;j++)
					arr1[i][j] = sc.nextInt();  
	      
	        transpose(arr1, arr2);
	        
	        System.out.print("Your matrix is \n");
	        print(arr1);
	        
	        System.out.print("Result matrix is \n");
	        print(arr2);
	        
    	}catch(NumberFormatException  | ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println(e);
    	}
        
        sc.close();
    }
}
  
