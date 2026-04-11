package curriculum.c;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("グー(0), チョキ(1), パー(2)を入力");
			int userHand = scanner.nextInt();
			
			if (userHand < 0 || userHand > 2) {
				System.out.println("0~2を入力してください");
				continue;
				
			}
			
			Player player = new Player(userHand);
			Cpu cpu = new Cpu();
			
			System.out.println("あなたの手: " + getHandName(player.hand));
			System.out.println("CPUの手: " + getHandName(cpu.hand));
			
			String result = judge(player.hand, cpu.hand);
			System.out.println(result);
			if (result.equals("あなたの勝ち！")) {
				break;
			}
		}
		scanner.close();
	}
	public static String getHandName(int hand) {
		switch(hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
			default:
				return "不明";
		}
	}
	public static String judge(int playerHand, int cpuHand) {
		if (playerHand == cpuHand) {
			return "あいこ";
		}else if ((playerHand == 0 && cpuHand == 1)
				||(playerHand == 1 && cpuHand == 2)
				||(playerHand == 2 && cpuHand == 0)) {
			return "あなたの勝ち！";
		} else {
			return "あなたの負け！";
			
		
		}
	}

}
