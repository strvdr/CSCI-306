
public class Troll {
	private int hitCount;
	public void fight() {
		java.util.Random rand = new java.util.Random();
		int damage = rand.nextInt(100);
		if (damage > 50)
			hitCount++;
		System.out.println(damage);
		System.out.println(hitCount);
		
	}

	public static void main(String[] args) {
		Troll ugly = new Troll();
		ugly.fight();
	}

}
