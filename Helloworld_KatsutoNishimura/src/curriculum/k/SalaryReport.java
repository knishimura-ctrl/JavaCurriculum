package curriculum.k;

public class SalaryReport {
	public void printReport(Employee employee) {
		System.out.println(employee.getName() + "の給与は" +employee.calculateSalary() + "円");
	}
}
