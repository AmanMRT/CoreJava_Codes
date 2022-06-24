import java.util.Scanner;

public class Question5 {
	
	//Approach 1 
	//using recursive approach
	public static String reverseString(String str)
	{
	  if(str.isEmpty())
	     return str;
	  else
	     return reverseString(str.substring(1))+str.charAt(0);
	  
	}
	
	//Approach 2
	//using character array
//	public static String reverseString(String str)
//	{
//      //Converting to character array
//      char ch[] = str.toCharArray();
//      int len = ch.length;
//      char result[] = new char[len];
//      
//      for(int i = 0; i<ch.length; i++) {
//         result[n-1] = ch[i];
//         n--;
//      }
	
//      return new String(result);
//	} 
	
	//Approach 3
	//using reverse loop
//	public static void reverseString(String str)
//	{
//      int len = ch.length;
//      String revString = "";
//		
		//reverse loop to fetch char from end
//      for (int i = str.length() - 1; i >= 0; --i) 
//			revString += str.charAt(i);
//	
//      System.out.println(revString);
//	} 
	
	//Driver Method
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
     
      try {
    	  
    	  System.out.println("Enter a String value: ");
          String str = sc.next();
          
          String result = reverseString(str);
          System.out.println(result);
          
      	}catch(NumberFormatException| ArrayIndexOutOfBoundsException e)
	  	{
				e.printStackTrace();
	  	}
      
      	sc.close();
   }
}
