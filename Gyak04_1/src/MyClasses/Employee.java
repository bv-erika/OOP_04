package MyClasses;

public class Employee {
	private String name;
	private int salary;
	
	public void increaseSalary(int value) {
		salary += value;
	}
	
	public String displayInfo() {
		//increaseSalary(100);
		return "Név: " + name + ", fizetés: " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0)
			this.salary = salary;
	}

}
