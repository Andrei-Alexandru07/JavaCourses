package eOOPPartTwoCompositionEncapsulationPolymorphism.bEncapsulation;

public class Player {
	
	public String fullName;
	public int healthhh;
	public String weapon;

	public void looseHealth(int damage) {
		this.healthhh = this.healthhh - damage;
		if(this.healthhh <= 0) {
			System.out.println("player knoked out.");
			// Reduce number of lives remaining for the player
		}
	}
	
	public int healthRemaining( ) {
		return this.healthhh;
	}
}
