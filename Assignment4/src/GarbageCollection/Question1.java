package GarbageCollection;

public class Question1 {
	static int noOfObjects = 0;
	  
    //using instance block 
    {
        noOfObjects += 1;
    }
  
    // various types of constructors
    public Question1()
    {
    }
    public Question1(int n)
    {
    }
    public Question1(String s)
    {
    }
  
    public static void main(String args[])
    {
        Question1 t1 = new Question1();
        Question1 t2 = new Question1(5);
        Question1 t3 = new Question1("ABC");
  
        //use CLass name instead of Object Reference
        System.out.println(Question1.noOfObjects);
        
        t1 = t2 = t3 = null;
        
    }
}
