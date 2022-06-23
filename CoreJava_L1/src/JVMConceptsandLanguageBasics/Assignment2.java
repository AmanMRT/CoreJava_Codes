package JVMConceptsandLanguageBasics;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operation 1
		int x1= -5;
		int y1 = 8;
		int z1 = 6;
		
		int result1 = x1 + y1 * z1;
		
		//Print results
		System.out.println("Operation 1 result: " + result1);
		
		//Operation 2
		int x2= 55;
		int y2 = 9;

		int result2 = (x2 + y2) % y2;
		
		//Print results
		System.out.println("Operation 2 result: " + result2);
		
		//Operation 3
		int x3= 20;
		int y3 = -3;
		int z3 = 5;
		int p3 = 8;
				
		int result3 = x3 + (-y3 * z3) /p3;
		
		//Print results
		System.out.println("Operation 3 result: " + result3);
		
		//Operation 4
		int x4= 5;
		int y4 = 15;
		int z4 = 3;
		int p4 = 2;
		int q4 = 8;
		
		int result4 = x4 + y4/z4 * p4 % q4;
		
		//Print results
		System.out.println("Operation 4 result: " + result4);
	}

}
