package Assignment1;

import java.util.Scanner;

public class Question7 {
	
	//driver function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		//local variable
		 float radius = 6371.01f;
	 
		 //Scanner class
	     Scanner sc=new Scanner(System.in);
	
	     System.out.println("Input Data");
	
	     System.out.print("Input the latitude of coordinate 1: ");
	     //user input
	     float x1=sc.nextFloat();
	
	     System.out.print("Input the longitude  of coordinate 1:");
	     //user input
	     float y1=sc.nextFloat();
	
	     System.out.print("Input the latitude of coordinate 2: ");
	     //user input
	     float x2=sc.nextFloat();
	
	     System.out.print("Input the longitude  of coordinate 2: ");
	     //user input
	     float y2=sc.nextFloat();
	    
	     //calclate distance
	     double distance = radius * (Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
		    	 	    
	     //result
	     System.out.println("The distance between those points is: "+ distance + " km.");
	
	     //scanner close
	     sc.close();
	}

}
