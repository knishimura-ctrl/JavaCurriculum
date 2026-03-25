package curriculum.b;


import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		//Q1
		int score = 75;
		if (score <= 60);
		System.out.println("合格です");
		
		//Q2
		int age = 25;
		if (age >= 20 && age <= 30) {
		System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}
		
		//Q3
		age = 18;
		if (age >= 20) {
			System.out.println("成人です");
		}else if (age >= 13 && age <= 19) {
			System.out.println("ティーンエイジャーです" );
		}else {
			System.out.println( "子供です" );
		}
		
		//Q4
		int x = 30;
		int y = 15;
		int z = 50;
		int max;
		
		if (x >= y && x >= z) {
			max = x;
		}else if (y >= x && y >= z) {
			max = y;
		}else  max = z;
		System.out.println(max);
		
		//Q5
		Scanner scanner = new Scanner (System.in);
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("正の数です");
		}else if (num == 0) {
			System.out.println("0です");
		}else System.out.println("負の数です");
		
		
		//Q6
		scanner = new Scanner (System.in);
		int value = scanner.nextInt();
		
		if (value % 2 == 0) {
			System.out.println("偶数です");
		}else
			System.out.println("奇数です");
		
		//Q7
		scanner = new Scanner (System.in);
		score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("優");
		}else if (score >= 70) {
			System.out.println("良");
		}else if (score >= 50) {
			System.out.println("可");
		}else { 
				System.out.println("不可");
			}
		
		//Q8
		scanner = new Scanner (System.in);
		
		String input = scanner.nextLine();		
		if (input == null || input.isEmpty()) {
			System.out.println("入力が無効です");
		}
		
		//Q9
		int day = 1; 
		switch(day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
			default:
			System.out.println("無効な入力です");
		}
		
		//Q10
		int month = 11;
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬");
		case 3:
		case 4:
		case 5:
			System.out.println("春");
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
		}
		
		
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
