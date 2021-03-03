package Tests;

import MyClasses.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("John");
		emp.setSalary(-4);
		System.out.println(emp.displayInfo());
		emp.increaseSalary(1000);
		System.out.println(emp.displayInfo());
	}

}
