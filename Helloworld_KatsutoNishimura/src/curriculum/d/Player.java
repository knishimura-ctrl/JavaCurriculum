package curriculum.d;
import java.util.Random;

public class Player extends Character {
	public Player(String name) {
		super(name, random(), random(), random());
	}
	
	private static int random() {
		Random r = new Random();
		return r.nextInt(91) + 10;
		
	

	}

}
