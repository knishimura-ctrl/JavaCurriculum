
package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		//Q1
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		//Q2
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//Q3
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		 
		//Q4
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			
		}
		System.out.println(sum);
		
		//Q5
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Q6
		int i = 1;
		 while (i <= 10) {
			 System.out.println(i);
			 i++;
		 }
		 
		 //Q7
		 int count = 2;
		  while (count <= 20) {
				  System.out.println(count);
				  count += 2;
				  
			  }
		  
		  //Q8
		  
		 i = 10;
		 while (i >= 1) {
			 System.out.println(i);
			 i--;
		 }
	     
		 //Q9
		 i = 0;
		 sum = 0;
		 sum += i;
		 while (i <= 100) {
			 i++;
		 }
		 System.out.println(sum);
		 
		 //Q10
		 Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();
			while (i == 0) {
				System.out.println("終了しました");
			break;
			
		 }
		//Q11
			for ( i = 1; i <= 9; i++) {
				for ( int j=1; j <= 9; j++)
					System.out.printf("%02d * %02d = %02d ||" , i,j,i*j);
				System.out.println();
			}
		//Q12
			scanner = new Scanner(System.in);
			Random random = new Random();
			
			System.out.println("パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ");
			String input = scanner.nextLine();
			String [] products = input.split("、");
			
			int tv = random.nextInt(12);
			int display = 11 - tv ;
			for (String product : products) {
				String item = product.trim();
				
				switch(item) {
				case "パソコン":
				case "冷蔵庫":
				case "洗濯機":
				case "扇風機":
				case "加湿器":
					System.out.println(item + "残り台数は" + random.nextInt(12) + "台です");
					break;
				case "テレビ":
				case "ディスプレイ":
					System.out.println(item + "残り台数は" +(item.equals("テレビ") ? tv : display) + "台です");
					break;
					default:
						System.out.println("『 " + item + " 』は指定の商品ではありません");
						break;
				}
			}
			
	}
	    
	

}
