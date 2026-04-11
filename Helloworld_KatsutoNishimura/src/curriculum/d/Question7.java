package curriculum.d;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Playerの名前を入力してください: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Daemon daemon = Daemon.loadDaemon("daemon_status.txt");
        if (daemon == null) {
            scanner.close();
            return;
        }

        StringBuilder log = new StringBuilder();

        log.append("=== Battle Start ===\n");
        log.append(player.getName()).append(" HP:")
           .append(player.getHp()).append(" AT:")
           .append(player.getAt()).append(" SP:")
           .append(player.getSp()).append("\n");

        log.append(daemon.getName()).append(" HP:")
           .append(daemon.getHp()).append(" AT:")
           .append(daemon.getAt()).append(" SP:")
           .append(daemon.getSp()).append("\n\n");

        Character first;
        Character second;

        if (player.getSp() > daemon.getSp()) {
            first = player;
            second = daemon;
        } else if (player.getSp() < daemon.getSp()) {
            first = daemon;
            second = player;
        } else {
            Random random = new Random();
            if (random.nextBoolean()) {
                first = player;
                second = daemon;
            } else {
                first = daemon;
                second = player;
            }
        }

        log.append("先攻: ").append(first.getName()).append("\n\n");

        int turn = 1;

        while (player.isAlive() && daemon.isAlive()) {
            log.append("---- Turn ").append(turn).append(" ----\n");

            second.takeDamage(first.getAt());
            log.append(first.getName()).append(" の攻撃 → ")
               .append(second.getName()).append(" に ")
               .append(first.getAt()).append(" ダメージ\n");
            log.append(second.getName()).append(" の残りHP: ")
               .append(second.getHp()).append("\n");

            if (!second.isAlive()) {
                break;
            }

            first.takeDamage(second.getAt());
            log.append(second.getName()).append(" の攻撃 → ")
               .append(first.getName()).append(" に ")
               .append(second.getAt()).append(" ダメージ\n");
            log.append(first.getName()).append(" の残りHP: ")
               .append(first.getHp()).append("\n\n");

            turn++;
        }

        log.append("\n=== Battle Result ===\n");
        if (player.isAlive()) {
            log.append(player.getName()).append(" の勝利!\n");
            System.out.println(player.getName() + " の勝利!");
        } else {
            log.append(daemon.getName()).append(" の勝利!\n");
            System.out.println(daemon.getName() + " の勝利!");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("battle_log.txt"))) {
            bw.write(log.toString());
            System.out.println("battle_log.txt に出力しました");
        } catch (IOException e) {
            System.out.println("battle_log.txt の出力に失敗しました");
        }

        scanner.close();
    }
}

	
        
		
		// TODO 自動生成されたメソッド・スタブ

	


