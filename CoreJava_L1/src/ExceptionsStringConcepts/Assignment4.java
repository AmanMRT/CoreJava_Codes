package ExceptionsStringConcepts;

public class Assignment4 {

	public static void main(String[] args) 
	{
		//memeber variable
		String str = "Malayalam";
		int count = 0;
		
		//Approach 1 (easier)
//		StringBuffer sb = new StringBuffer(str);
//		String str1 = sb.reverse().toString();
//		
//		if(str.equalsIgnoreCase(str1))
//			System.out.println("YES");	//is a Palindrome
//		else
//			System.out.println("NO");	//is not a Palindrome
		
		//Approach 2
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == str.charAt(str.length()-1-i))
				count++;	//counter 	
		}	
		
		//if count is > 1 then is a Palindrome
		if(count > 1)		
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
