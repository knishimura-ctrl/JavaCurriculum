package curriculum.h;

public class PartTimeEmployee extends Employee{
		private static final int HOURLY_RATE = 1000;
		
		PartTimeEmployee(String employeeld, String name){
			super(employeeld, name);
		}
		public int calculateDailyWage(int hoursWorked) {
				return hoursWorked * HOURLY_RATE;
	}
}
