package ExceptionHandling;

//user dwefined exception
class InvalidAgeException extends Exception{
	@Override
	public String toString() {
		return ("Age must be >=18 and <60");
	}
}

public class Question1 {

	public static void main(String[] args) 
	{	
		//comand line arguments
        String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		//condition
		if(age>=18 && age<60)
			System.out.println(name + " has proper Age");
		else
		{
			try {
				throw new InvalidAgeException();		//throw user defined exception
			}
			catch(InvalidAgeException ex) {
				ex.printStackTrace();
			}
		}
	}
}
