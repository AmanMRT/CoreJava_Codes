
public class MAQ {

	static String check(char[] str1, char[] str2)
	{
		String result = null;
		
		for(int i=1;i<str1.length;i++)
		{
			if(Math.abs((str1[i] - str1[i-1])) == Math.abs(str2[i] - str2[i-1]))	
				result = "valid";
			result = "invalid";
		}
		return result;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "acxs";
		String b = "sxca";
		
		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();
		
		System.out.println(check(str1,str2));
		
	}

}
