package curriculum.h;

public abstract class Employee {
	String employeeld;
	String name;
	
	public Employee (String employeeld, String name ) {
		this.employeeld = employeeld;
		this.name = name;
	}
	public String getEmployeeld() {
		return employeeld;
		}
	public String getName() {
		return name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked);
}