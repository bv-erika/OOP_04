package Tests;

import MyClasses.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee[] empArray = new Employee[5];
		
		for (int i=0; i<empArray.length; i++) {
			empArray[i] = new Employee();
			empArray[i].setName("Emp_" + (i+1));
			empArray[i].setSalary((i+1)*10000);
		}
		listArray(empArray);
		
		System.out.println("Best paid: " + 
					empArray[hasMaxSalary(empArray)].getName());
		
		int lower = 25000;
		int upper = 35000;
		System.out.println("Num of salaries in range: " + 
				countSalaries(empArray, lower, upper));
	}

	private static int countSalaries(Employee[] array, int lower, int upper) {
		int counter = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i].isInRange(lower, upper))
				counter++;
		}
		return counter;
	}
	
	private static int hasMaxSalary(Employee[] array) {
		int maxIndex = 0;
		for (int i=1; i<array.length; i++) {
			if (array[i].hasHigherSalary(array[maxIndex])) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	private static void listArray(Employee[] array) {
		for (Employee item : array) {
			System.out.println(item.displayInfo());
		}
	}
}
