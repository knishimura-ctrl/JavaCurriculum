package curriculum.h;

public class Main {
		public static void main(String[] args) {
			
		FullTimeEmployee full = new FullTimeEmployee("1108", "来栖");
		PartTimeEmployee part = new PartTimeEmployee("0414","久遠");
		
		int fullpay = full.calculateDailyWage(9);
		int partpay = part.calculateDailyWage(9);
		
		System.out.println("正社員の給与: " + fullpay + " 円");
        System.out.println("パート社員の給与: " + partpay + " 円");
		}
}
