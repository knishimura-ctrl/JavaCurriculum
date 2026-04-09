package curriculum.h;

public class FullTimeEmployee extends Employee {
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