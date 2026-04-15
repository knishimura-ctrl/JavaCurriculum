package curriculum.d;

public class Character {
	private String name;
	private int hp;
	private int at;
	private int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	public int getHp() {
	    return hp;
	}

	public int getAt() {
	    return at;
	}

	public int getSp() {
	    return sp;
	}

	public String getName() {
	    return name;
	}
	public void takeDamage(int damage) {
	    this.hp -= damage;
	    if (this.hp < 0) {
	        this.hp = 0;
	    }
	}
	public boolean isAlive() {
	    return this.hp > 0;
	}

	

}
