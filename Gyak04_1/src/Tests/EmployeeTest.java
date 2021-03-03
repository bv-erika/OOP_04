package Tests;

import MyClasses.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("John");
		emp1.setSalary(10000);
		
		Employee emp2 = new Employee();
		emp2.setName("Jane");
		emp2.setSalary(15000);
		
		System.out.println(emp1.displayInfo());
		System.out.println(emp2.displayInfo());
		
		boolean res = emp1.hasHigherSalary(emp2);
		if (res)
			System.out.println(emp1.getName() + " fizetése nagyobb");
		else
			System.out.println(emp1.getName() + " fizetése kisebb");
		
		System.out.println(emp2.compareSalary(emp1).getName());
		
	}

}
