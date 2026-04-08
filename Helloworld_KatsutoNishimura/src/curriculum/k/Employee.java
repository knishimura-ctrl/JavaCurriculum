package curriculum.k;

public abstract class Employee{
	private String name;
	private int hours;
	
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
}
	public String getName() {
		return  name;
	}
	public int getHours() {
		return hours;
	}
	public abstract int calculateSalary();
}
	
	class FullTimeEmployee extends Employee{
		public FullTimeEmployee(String name, int hours) {
			super(name, hours);
		}
		public int calculateSalary() {
			return getHours() * 1200;
		}
	}
	class ContractEmployee extends Employee{
		public ContractEmployee(String name, int hours) {
			super(name, hours);
		}
		public int calculateSalary() {
			return getHours() * 1000;
		}
	}
	class SalaryReport{
		public void printReport(Employee employee) {
			System.out.println(employee.getName() + "の給与は" +employee.calculateSalary() + "円");
		}
	}
	class Main{
		public static void main(String[] arg) {
			Employee emp1 = new FullTimeEmployee("来栖",8);
			Employee emp2 = new ContractEmployee("久遠",6);
			SalaryReport rep = new SalaryReport();
			
			rep.printReport(emp2);
			rep.printReport(emp1);
		}
	}

//変更前　変更理由共通のものだけに絞る	
//class SalaryCalculator {
	//public void calculateSalary(Employee e) {
		// 社員タイプごとに if で分岐
		//if (e.getType().equals("FullTime")) {
		//System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
		//} else if (e.getType().equals("Contract")) {
		//System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
		//}
		//}
		//} 
//class Employee {	
//private String name;	
//private String type;	
//private int hours;	
	
//public Employee(String name, String type, int hours) {	
//this.name = name;	
//this.type = type;	
//this.hours = hours;	
//}	
	
//public String getName() { return name; }	
//public String getType() { return type; }	
//public int getHours() { return hours; }	
//}