package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class MyClassWithLambda implements WordCount {

	public int count(String str) {
		// TODO Auto-generated method stub
		
		String[] split = str.trim().split("\\s+");
				
		List<String> list = Arrays.asList(split);
		
		int count = (int) list.stream()
				.filter(i -> (i.length() > 0))
				.count();
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "How was your day today?";
		
		MyClassWithLambda obj = new MyClassWithLambda();
		
		System.out.println(obj.count(str));
	}

}
