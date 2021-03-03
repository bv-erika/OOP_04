package MyClasses;

public class Employee {
	private String name;
	private int salary;
	
	// a)
	public void increaseSalary(int value) {
		salary += value;
	}
	
	public String displayInfo() {
		//increaseSalary(100);
		return "Név: " + name + ", fizetés: " + salary +
				", adó: " + getTax();
	}

	// b)
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

	// c)
	public boolean isInRange(int lower, int upper) {
		if (this.salary <= upper && this.salary >= lower)
			return true;
		return false;
	}
	
	public double getTax() {
		return Math.round(this.salary*0.16);
	}
	
	public boolean hasHigherSalary(Employee e) {
		if (this.salary > e.salary)
			return true;
		return false;
	}
	
	public Employee compareSalary(Employee e) {
		if (this.salary > e.salary)
			return this;
		return e;
	}
	
}
