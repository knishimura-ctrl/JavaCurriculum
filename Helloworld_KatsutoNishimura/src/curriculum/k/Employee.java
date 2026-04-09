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