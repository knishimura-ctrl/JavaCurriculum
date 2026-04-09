package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) {
			List<Employee> list = new ArrayList<>();
			list.add(new FullTimeEmployee("001","a"));
			list.add(new FullTimeEmployee("002","a'"));	
			list.add(new ContractEmployee("003","b"));
			list.add(new ContractEmployee("004","b'"));
			
			for(Employee emp:list) {
				int wage = emp.calculateDailyWage(9);
				System.out.println(wage + "円");
			}

}
}
