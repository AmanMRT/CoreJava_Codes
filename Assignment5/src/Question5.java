import java.util.HashSet;
import java.util.Iterator;

public class Question5 {

	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		
		set.add("ABC1");
		set.add("ABC2");
		set.add("ABC3");
		set.add("ABC4");
		set.add("ABC5");
		
		Iterator<String> itr = set.iterator();
		for(String s : set)
			if(itr.hasNext())
				System.out.println(s);
		
	}
}
