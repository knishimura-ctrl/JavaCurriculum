package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) {
			List<Billable> list = new ArrayList<>();
			list.add(new FullTimeEmployee("101","来栖"));
			list.add(new FullTimeEmployee("202","久遠"));
			list.add(new ContractEmployee("303","千歳"));
			list.add(new ContractEmployee("404","マロ"));
			
			for(Billable b : list) {
				System.out.println(b.costForDay(9) + "円");
			}
		}

}
