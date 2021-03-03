package MyClasses;

public class Employee {
	String name;
	int salary;
	
	void increaseSalary(int value) {
		salary += value;
	}
	
	String displayInfo() {
		//increaseSalary(100);
		return "Név: " + name + ", fizetés: " + salary;
	}
	
	
}
