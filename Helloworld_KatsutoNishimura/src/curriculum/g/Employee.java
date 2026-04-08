package curriculum.g;

public class Employee {
	String employeeld;
	String name;
	
	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}
	public String getEmployeeld() {
		return employeeld;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("田中花子");
		emp.setEmployeeld("E002,");
		
		System.out.println("社員ID:" + emp.getEmployeeld() + "名前:" + emp.getName());
		
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
