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
	
	class FullTimeEmployee extends Employee {
		private static final int HOURLY_RATE = 1200;
		
		FullTimeEmployee(String employeeld, String name) {
			super(employeeld, name);
		}
		@Override
		public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		}else { int normalPay = 8 * HOURLY_RATE;
		int overtimeHour = hoursWorked -8;
		int overtimePay = (int)(overtimeHour * HOURLY_RATE * 1.25);
		
		return normalPay + overtimePay;
				
		}
		}
	
	}
	
	class PartTimeEmployee extends Employee{
		private static final int HOURLY_RATE = 1000;
		
		PartTimeEmployee(String employeeld, String name){
			super(employeeld, name);
		}
		public int calculateDailyWage(int hoursWorked) {
				return hoursWorked * HOURLY_RATE;
	}
	}
	class Main{
		public static void main(String[] args) {
			
		FullTimeEmployee full = new FullTimeEmployee("", "");
		PartTimeEmployee part = new PartTimeEmployee("","");
		
		int fullpay = full.calculateDailyWage(9);
		int partpay = part.calculateDailyWage(9);
		
		System.out.println("正社員の給与: " + fullpay + " 円");
        System.out.println("パート社員の給与: " + partpay + " 円");
		}
		
	}

	
	
	




