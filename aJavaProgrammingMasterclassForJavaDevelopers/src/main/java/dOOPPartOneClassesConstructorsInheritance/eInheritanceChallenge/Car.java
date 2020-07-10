package dOOPPartOneClassesConstructorsInheritance.eInheritanceChallenge;

public class Car extends Vehicle {
	
	private int numberOFWheels;
	private int numberOFDoors;
	private int numberOFGears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, String size, int numberOFWheels, int numberOFDoors, int numberOFGears, boolean isManual) {
		super(name, size);
		this.numberOFWheels = numberOFWheels;
		this.numberOFDoors = numberOFDoors;
		this.numberOFGears = numberOFGears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
	}
	
	public void changeVlocity(int speed, int direction) {
		System.out.println("Car.changeVelocity(): Velocity " + speed + " in direction " + direction);
		move(speed, direction);
		
	}

	public int getNumberOFWheels() {
		return numberOFWheels;
	}

	public int getNumberOFDoors() {
		return numberOFDoors;
	}

	public int getNumberOFGears() {
		return numberOFGears;
	}

	public boolean isManual() {
		return isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}
	
	
}
