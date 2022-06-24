package Assignment1;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//local variable
		int count = 0;
		
		//for loop
		for(int i = 0; i < 4; i++)
			for(int j = 0; j< 4; j++)
				for(int k = 0; k< 4; k++)
					if(i != j && j!= k && i != k )
					{
						System.out.println(i + ""+ j + "" + k);
						count++;	//counter increment by 1
					}
		//result
		System.out.println("Total number of the three-digit-number is " +count);
	}
}


