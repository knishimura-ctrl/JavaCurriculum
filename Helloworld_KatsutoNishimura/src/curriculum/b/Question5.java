package curriculum.b;
import curriculum.a.Greeting;

public class Question5 {
	

	public static void main(String[] args) {
		//Q1
		helloworld();
		
		//Q2
		doubleValue();
		
		//Q3
		isEven();
		
		//Q4
		Greeting.sayHello();
		
		//Q5
		Animal a = new Animal();

        a.setName("ライオン");
        a.setLength(2.1);
        a.setSpeed(80);

        System.out.println("動物名：" + a.getName());
        System.out.println("体長：" + a.getLength() + "m");
        System.out.println("速度：" + a.getSpeed() + "km/h");
		}
	
			
		
		// TODO 自動生成されたメソッド・スタブ

	
	//Q1
	public static void helloworld() {
		System.out.println("Hello, World!");
	}
	//Q2
	public static int doubleValue(int num) {
		return num *2;
		}
	public static void doubleValue() {
		int result = doubleValue(10);
		System.out.println(result);
	}
	//Q3
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	public static void isEven() {
		int num1 = 10;
		int num2 = 7;
		
		if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }

        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }
	}
	
	
	
	

	}
