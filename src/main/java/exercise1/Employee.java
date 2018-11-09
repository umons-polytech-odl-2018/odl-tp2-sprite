package exercise1;

public abstract class Employee {  // il faut creer la classe abstraite

	private String name;
	protected int sales = 0;
	protected int workedHours = 0;

	public Employee(String name) {
		this.name = name;

	}

	public abstract int computeSalary();


	public void sell() {
		sales ++;
	}

	public void workOneHour() {
		workedHours ++;
	}

	public String getName() {
		return name;
	}
}
