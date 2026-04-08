package curriculum.i;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {				
	protected String id;				
	protected String name;				
	public Employee(String id, String name) {				
	this.id = id;				
	this.name = name;				
	}				
	public abstract int calculateDailyWage(int hoursWorked);				
	}				
					
	class FullTimeEmployee extends Employee {				
	public FullTimeEmployee(String id, String name) {				
	super(id, name);				
	}				
	@Override				
	public int calculateDailyWage(int hoursWorked) {				
	int hourlyRate = 1250;				
	int overtime = Math.max(0, hoursWorked - 8);				
	int regularHours = hoursWorked - overtime;				
	return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);				
	}				
	}				
					
	class ContractEmployee extends Employee {				
	public ContractEmployee(String id, String name) {				
	super(id, name);				
	}				
	@Override				
	public int calculateDailyWage(int hoursWorked) {				
	int hourlyRate = 1000;				
	return hoursWorked * hourlyRate;				
	}				
	}				
class Main{
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new FullTimeEmployee("001","a"));
		list.add(new FullTimeEmployee("002","a'"));	
		list.add(new ContractEmployee("003","b"));
		list.add(new ContractEmployee("004","b'"));
		
		for(Employee emp:list) {
			int wage = emp.calculateDailyWage(9);
			System.out.println(wage + "円");
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
