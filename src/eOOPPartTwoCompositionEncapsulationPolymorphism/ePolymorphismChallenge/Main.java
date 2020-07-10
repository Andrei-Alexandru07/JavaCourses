package eOOPPartTwoCompositionEncapsulationPolymorphism.ePolymorphismChallenge;

//1. CAR CLASS	

class Car {
	
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	public Car(String name, int cylinders) {
		
		this.name = name;
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
	}
	
	public String startEngine() {
		return "Starting engine...";
	}
	
	public String accelerate() {
		return "Accelerating...";
	}
	
	public String brake() {
		return "Braking...";
	}
	
	public String getName() {
		return name;
	}
	public boolean isEngine() {
		return engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	
}

//2. AUDI CLASS

class Audi extends Car {

	public Audi(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String brake() {
		
		return "My Audi is: " + super.brake();
	}

	@Override
	public String startEngine() {
		
		return "My Audi is: " + super.startEngine();
	}

	@Override
	public String accelerate() {
		
		return "My Audi is: " + super.accelerate();
	}
	
}	

//3. CLASS PORSCHE
	
class Porsche extends Car{

		public Porsche(String name, int cylinders) {
			super(name, cylinders);
		}

		@Override
		public String brake() {
			
			return "My Porsche is: " + super.brake();
		}

		@Override
		public String startEngine() {
			
			return "My Porsche is: " + super.startEngine();
		}

		@Override
		public String accelerate() {
			
			return "My Porsche is: " + super.accelerate();
		}

	}

//4. CLASS BMW

class BMW extends Car{

	public BMW(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String brake() {
		
		return "My BMW is: " + super.brake();
	}

	@Override
	public String startEngine() {
		
		return "My BMW is: " + super.startEngine();
	}

	@Override
	public String accelerate() {
		
		return "My BMW is: " + super.accelerate();
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car("Sedan", 6);
		Audi audi = new Audi("Audi", 4);
		Porsche porsche = new Porsche("Porsche", 12);
		BMW bmw = new BMW("BMW", 8);
		
		System.out.println(car.accelerate());
		System.out.println(audi.accelerate());
		System.out.println(porsche.accelerate() + "with all " + porsche.getCylinders() + " cylinders");
		System.out.println(bmw.startEngine());
	}
}


