class Runnable1 implements Runnable{
	 
	public void run() 
	{	
	  for(int n=1;n< 6;n++) 
	  {
		  
	   int random = (int) (Math.random() * 10);
	   
	   System.out.println("Number : " + random);
	   
	   int fac = 1;
	   
	   if (random == 0) 
		   System.out.println("Factorial  of " + random + " : 1");
	   else 
	   {
		  for(int i=1;i <=random;i++)  
			  fac=fac*i;    
	    
	     System.out.println("Factorial  of " + random + " : " + fac);
	    }
	  }
	}
}
public class Question1 {

   public static void main(String[] args) {
      
	   Runnable r = new Runnable1();
       Thread t = new Thread(r);
       Thread t2 = new Thread(r);
       t.start();
       t2.start();
   }
}

