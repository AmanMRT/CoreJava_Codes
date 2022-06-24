import java.util.Comparator;

public class Sortbyroll implements Comparator<Student> {

	// Method
	// Sorting in ascending order of roll number
	public int compare(Student a, Student b)
	{

		return a.rollno - b.rollno;
	}
}