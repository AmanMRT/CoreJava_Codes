package Question3;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB  dao = new EmployeeDB();
		
		Employee emp1 = new Employee("Abc1",101,"DEV1",100001);
		Employee emp2 = new Employee("Abc2",102,"DEV2",100002);
		Employee emp3 = new Employee("Abc3",103,"DEV3",100003);
		Employee emp4 = new Employee("Abc4",104,"DEV4",100004);
		Employee emp5 = new Employee("Abc5",105,"DEV5",100005);
								
		dao.addEmployee(emp1);
		dao.addEmployee(emp2);
		dao.addEmployee(emp3);
		dao.addEmployee(emp4);
		dao.addEmployee(emp5);
		
		//System.out.print(dao.searchEmployee(101));
				
		System.out.println(dao.deleteEmployee(101));
		System.out.println(dao.paySlip(2));
		System.out.println(dao.listAll());
		
	}

}
