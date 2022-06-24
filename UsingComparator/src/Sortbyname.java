import java.util.Comparator;

public class Sortbyname implements Comparator<Student> {

	// Method
	// Sorting in ascending order of name
	public int compare(Student a, Student b)
	{

		return a.name.compareTo(b.name);
	}
}