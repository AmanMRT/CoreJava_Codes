import java.util.HashMap;

public class Question4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ABC1", 1234567891);
		map.put("ABC2", 1234567892);
		map.put("ABC3", 1234567893);
		map.put("ABC4", 1234567894);
		map.put("ABC5", 1234567895);
		
		String key ="ABC2";
		if(map.containsKey(key))
		{
			System.out.println(map.get(key));
		}
	}

}