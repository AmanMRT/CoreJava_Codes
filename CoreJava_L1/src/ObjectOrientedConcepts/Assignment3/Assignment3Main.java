package ObjectOrientedConcepts.Assignment3;

public class Assignment3Main
{	
	public static void main(String[] args) {
		
		//object creation with new keyword
		Novel novel = new Novel(123,"ABC","ABCDEF",10000, "MNOPQRS");
		novel.displayNovelDetails();				//display Novel details
		
		//object creation with new keyword
		Magazine magazine = new Magazine(123,"ABC","ABCDEF",10000, "Fictional");
		magazine.displayMagazinelDetails();			//display Magazine details
		
	}
}