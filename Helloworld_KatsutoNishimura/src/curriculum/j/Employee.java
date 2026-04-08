package curriculum.j;
import java.util.ArrayList;
import java.util.List;

interface Billable{
	int costForDay(int hoursWorked);
}
abstract class Employee implements Billable{
	protected String id;
	protected String name;

public Employee(String id, String name) {
	this.id = id;
	this.name = name;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public abstract int costForDay(int hoursWorked);
}
class FullTimeEmployee extends Employee{
	public FullTimeEmployee(String id, String name) {
		super(id,name);
	}
		public int costForDay(int hoursWorked) {
			int hourlyRate = 1250;
			int overtime = Math.max(0,hoursWorked - 8);
			int regularHours = hoursWorked - overtime;
			
			return (regularHours * hourlyRate)
					+ (int)(overtime * hourlyRate *1.25);
		}
	}
class ContractEmployee extends Employee{
	public ContractEmployee(String id, String name) {
		super(id, name);
	}
	
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}

class Main{
	public static void main(String[] args) {
		List<Billable> list = new ArrayList<>();
		list.add(new FullTimeEmployee("",""));
		list.add(new FullTimeEmployee("",""));
		list.add(new ContractEmployee("",""));
		list.add(new ContractEmployee("",""));
		
		for(Billable b : list) {
			System.out.println(b.costForDay(9) + "円");
		}
	}
		// TODO 自動生成されたメソッド・スタブ

	}
