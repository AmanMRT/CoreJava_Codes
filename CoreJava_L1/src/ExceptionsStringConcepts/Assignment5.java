package ExceptionsStringConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment5 {
	
	public static void main(String[] args)
	{
		String str ="How was your day today";
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
				
		for(Map.Entry entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
	}
}
