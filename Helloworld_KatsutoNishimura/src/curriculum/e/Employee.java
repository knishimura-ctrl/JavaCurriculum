package curriculum.e;

public class Employee {
	String name;
	
	public void work(){
		System.out.println( name + "は働いています");
	}
}

class Main{
	public static void main(String[] args) {
		Employee p = new Employee();
		
		p.name = "山田太郎";
		p.work();
	}
}


		// TODO 自動生成されたメソッド・スタブ
