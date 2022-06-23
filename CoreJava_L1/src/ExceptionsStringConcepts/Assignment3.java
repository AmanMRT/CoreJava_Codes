package ExceptionsStringConcepts;

public class Assignment3 {

	public static void main(String[] args) 
	{		
		try
		{
			if(args.length < 5)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			
			int avg = ((Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]) + Integer.parseInt(args[4])))/5;
			System.out.println(avg);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
