package JVMConceptsandLanguageBasics;

public class Assignment3 {

	//static function to call without object creation
	public static void convertMinutes(long minutes)
	{
		// Number of minutes in a year
		long year = minutes / 525600;
		long remainingMinutes = minutes % 525600;
		long day = remainingMinutes / 1440;

		//Print minutes into respective years and days
		System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long minutes = 1402917091;
		
		//static function called
		Assignment3.convertMinutes(minutes);
	}

}
