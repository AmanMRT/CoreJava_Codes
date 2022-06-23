package ThreadsCollectonFrameworkGarbageCollection.Assignment6;

class Finallize {

	final void A1()
	{
		System.out.println("Finalize method called");
	}

}

public class FinalizeMain
{
	public static void main(String[] args) 
    {
	
		Finallize obj = new Finallize();
		obj = new Finallize();
		obj = new Finallize();
		
		Runtime.getRuntime().gc(); 
		
	}
}