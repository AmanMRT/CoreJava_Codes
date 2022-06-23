package ThreadsCollectonFrameworkGarbageCollection.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	
	ArrayList<Employee> list = new ArrayList<>();
	
	public boolean addEmployee(Employee emp)
	{
		list.add(emp);
		System.out.println("Employee added suceesgully with id "+ emp.getId());
		return true;
	}
	
	public boolean searchEmployee(int id)
	{
		if(list.equals(id))
		{
			System.out.println("Employee Details with id "+ id + " is" + list.get(id));
		}
		return true;
	}
	
	public boolean deleteEmployee(int id)
	{
		if(list.equals(id))
		{
			list.remove(id);
			System.out.println("Employee Deleted with id "+ id);
		}
	
		return true;
	}
	
	public String paySlip(int id)
	{
		return"Employee Details with id "+ id + " is" + list.get(id);
	}
	
	public ArrayList listAll()
	{	
		//Object[] emps = list.toArray();
		return list;
	}
}
