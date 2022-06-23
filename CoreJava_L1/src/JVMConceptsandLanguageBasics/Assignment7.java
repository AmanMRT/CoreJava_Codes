package JVMConceptsandLanguageBasics;

public class Assignment7 {
	
	public static int factorial(int n) {
	    if (n == 0)
	        return 1;
	    else {
	        int newVal = n*factorial(n-1);
	        System.out.println(newVal);
	        return newVal;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		factorial(n);
		
	}

}
