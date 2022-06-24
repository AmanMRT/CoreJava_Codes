import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question12 {

	static void occurance(String str)
	{
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
						
		char cmin = Collections.min(map.keySet());
		int min = map.get(cmin);
		char cmax = Collections.max(map.keySet());
		int max = map.get(cmax);
		
		System.out.println(map);
		
		System.out.println("Minumum->	Key: "+cmin + "	Value: "+min);
		System.out.println("Maximum->	Key: "+cmax + "	Value: "+max);
		
	
	}
	public static void main(String[] args) {
		
		//scanner class 
		Scanner sc = new Scanner(System.in);
		
		//user input
		try
		{
			System.out.print("Enter String: ");
			String str = sc.next();
			
			occurance(str);
			
		}catch(NumberFormatException  | InputMismatchException e)
    	{
			e.printStackTrace();
    	}
        
        sc.close();
	}
}
