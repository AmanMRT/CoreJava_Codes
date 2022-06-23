package ThreadsCollectonFrameworkGarbageCollection;


class RandomNumber extends Thread
{
	static int num;
	
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				num=(int)(Math.random()*10);
				System.out.println("Number: "+ num);
				sleep(500);
				
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Threading2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				int fact=1;
				
				for(int j=1;j<=(RandomNumber. num);j++)
				{
					if(RandomNumber.num ==0)
					{
						System.out.println("1");
						break;
					}
					fact=fact*1;
			    }
				System.out.println("factorial:"+fact);
				sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
		    }
		}
	}
}

public class Assignment1 {
	public static void main(String[]args)
	{
		RandomNumber t1=new RandomNumber();
		t1.start();
		Threading2 t2=new Threading2();
		t2.start();
		
	}
	

}
