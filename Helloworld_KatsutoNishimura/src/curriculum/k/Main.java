package curriculum.k;

public class Main {
	public static void main(String[] arg) {
		Employee emp1 = new FullTimeEmployee("来栖",8);
		Employee emp2 = new ContractEmployee("久遠",6);
		SalaryReport rep = new SalaryReport();
		
		rep.printReport(emp2);
		rep.printReport(emp1);
	}
}
