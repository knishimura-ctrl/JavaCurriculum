package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		//Q1
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		float floatNum = 0;
		double doubleNum = 0;
		char letter = '0';
		String letters = null;
		boolean isBoolean = false;
		
		//Q2
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		//Q3
		
		System.out.println(longNum + intNum + shortNum + byteNum);
		System.out.println(byteNum * 2);
		System.out.println(letter + letters + isBoolean);
		int sumNum = (int) (byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		System.out.println(sumNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		//Q4
		String Name = "山田太朗";
		System.out.println("こんにちは、" + Name + "さん！");
		
		//Q5
		int age = 25;
		System.out.println("年齢:" + age);
		
		//Q6
		int num1 = 10;
		int num2 = 5;
		int sum = (num1 + num2);
		System.out.println(sum);
		
		//Q7
		int score = 80;
		score = 80 + 20;
		System.out.println("最終スコア:" + score);
		
		//Q8
		double price = 99.99;
		int intprice = (int) price;
		System.out.println("整数価格" + intprice);
		
		//Q9
		String numStr = "123";
		int intnumStr = Integer.parseInt(numStr);
		System.out.println("変換後の値:" + (intnumStr + 10));
		
		//Q10
		int num = 50;
		String  str = String.valueOf(num);
		System.out.println("得点：" + str + "点");
		
		//Q11
		int a = 10;
		int b = 20;
		boolean result = a<b;
		System.out.println(result);
		
		//Q12
		int x = 15;
		String results = (x > 15) ? "OK" :"NG" ;
		
		
		//Q13
		String text = "私Javaが好きです。Java楽しい！";
		String resultss = text.replace ("Java","Python");
		System.out.println(resultss);
		
		
		
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
