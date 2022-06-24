package LambdaExpressions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImplClassWithLambda implements CharacterOccurance{

	@Override
	public int findOccurence(String str, char c) {
		// TODO Auto-generated method stub
		
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char cc : arr)
		{
			if(map.containsKey(cc))
			{
				map.put(cc, map.get(cc)+1);
			}
			else
			{
				map.put(cc, 1);
			}
		}
		
		//System.out.println(map);
		
		
		
		Set<Entry<Character, Integer>> entry = map.entrySet();
	
		entry.forEach(i -> {
			if(map.containsKey(c)) { System.out.println(i.getValue());}
		});
				
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "How was your day today?";
		char c  ='a';
		
		ImplClassWithLambda obj = new ImplClassWithLambda();
		obj.findOccurence(str, c);
	}

	

}
