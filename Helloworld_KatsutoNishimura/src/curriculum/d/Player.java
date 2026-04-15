package curriculum.d;
import java.util.Random;

public class Player extends Character {
	public Player(String name) {
		super(name, random(), random(), random());
	}
	
	private static final Random r = new Random();
	private static int random() {
		return r.nextInt(91) + 10;
		
	

	}

}
