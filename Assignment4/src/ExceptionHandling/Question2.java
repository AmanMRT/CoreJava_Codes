package ExceptionHandling;

public class Question2 {
	public static void main(String[] args) 
	{
		 //student 1
		//command line arguments
		 String name1 = args[0];
		 int marks1 = Integer.parseInt(args[1]);
		 int marks2 = Integer.parseInt(args[2]);
		 int marks3 = Integer.parseInt(args[3]);
		 
		 //student 2 
		//command line arguments
		 String name2 = args[4];
		 int marks4 = Integer.parseInt(args[5]);
		 int marks5 = Integer.parseInt(args[6]);
		 int marks6 = Integer.parseInt(args[7]);
		 
		 try
		 {
			 //average 1
			int avg1 = (marks1 + marks2 + marks3)/3;
			System.out.println(avg1);
			
			//average 2 
			int avg2 = (marks4 + marks5 + marks6)/3;
			System.out.println(avg2);
			
		 }catch(NumberFormatException e)	//Exception caught
		 {
			 System.out.println(e);		//prints exception
		 }
	}
}
