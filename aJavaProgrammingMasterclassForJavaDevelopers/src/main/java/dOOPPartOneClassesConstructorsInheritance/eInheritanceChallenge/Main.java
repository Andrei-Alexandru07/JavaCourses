package dOOPPartOneClassesConstructorsInheritance.eInheritanceChallenge;

public class Main {
	
	public static void main(String[] args) {
		
		Outlander outlander = new Outlander(36);
		outlander.steer(45);
		outlander.accelerate(30);
		outlander.accelerate(20);
		outlander.accelerate(-20);
		
		System.out.println(outlander.getName());
		System.out.println(outlander.getNumberOFWheels());
		System.out.println(outlander.getCurrentGear());
		
	}
}
