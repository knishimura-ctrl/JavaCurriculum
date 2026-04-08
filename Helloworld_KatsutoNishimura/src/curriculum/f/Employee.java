package curriculum.f;

public class Employee {
	String employeeld;
	String name;
	public  void showinfo() {
		System.out.println("社員ID:" + employeeld + "名前:" + name);
	}
}
class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.employeeld = "E001,";
		emp.name = "佐藤太郎";
		
		emp.showinfo();
		
		

		
		// TODO 自動生成されたメソッド・スタブ

	}

}
