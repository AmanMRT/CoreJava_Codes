package ThreadsCollectonFrameworkGarbageCollection;

import java.util.Date;

class Runnable3 implements Runnable{
	 
	 public void run() 
	 {	 
		  for(int n=1;n<=20;n++) 
		  {
			  Date date = new Date();
			  try {
		      // display time and date using toString()
		      System.out.println(date.toString());
		      
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	  }
}
public class Assignment2 {

    public static void main(String[] args) {
       
    	Runnable r = new Runnable3();
        Thread t = new Thread(r);
        
        t.start();
        
    }
}

