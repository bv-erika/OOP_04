package MyClasses;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "John";
		emp.salary = 10000;
		System.out.println(emp.displayInfo());
		emp.increaseSalary(1000);
		System.out.println(emp.displayInfo());
	}

}
