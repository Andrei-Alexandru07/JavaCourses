package eOOPPartTwoCompositionEncapsulationPolymorphism.aComposition;

public class Door {
	
	private String colour;
	private DoorDimensions dimension;
	private String material;
	
	public Door(String colour, DoorDimensions dimension, String material) {
	
		this.colour = colour;
		this.dimension = dimension;
		this.material = material;
	}
	
	public void openDoor() {
		System.out.println("Door opened!");
	}
	
	public void closeDoor() {
		System.out.println("Door closed!");
	}

	public String getColour() {
		return colour;
	}

	public DoorDimensions getDimension() {
		return dimension;
	}

	public String getMaterial() {
		return material;
	}
	

	

}
