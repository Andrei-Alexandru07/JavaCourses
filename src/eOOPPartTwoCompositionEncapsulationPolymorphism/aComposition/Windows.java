package eOOPPartTwoCompositionEncapsulationPolymorphism.aComposition;

public class Windows {
	
	private int numberOfWindows;
	private String Shape;
	private WindowsDimensions dimensions;
	
	public Windows(int numberOfWindows, String shape, WindowsDimensions dimensions) {
		
		this.numberOfWindows = numberOfWindows;
		this.Shape = shape;
		this.dimensions = dimensions;
	}
	
	public void openWindow() {
		System.out.println("Window opened!");
	}
	
	public void closeWindow() {
		System.out.println("Window closed!");
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public String getShape() {
		return Shape;
	}

	public WindowsDimensions getDimensions() {
		return dimensions;
	}
	
	
	
	

}
