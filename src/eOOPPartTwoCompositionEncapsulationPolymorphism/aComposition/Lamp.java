package eOOPPartTwoCompositionEncapsulationPolymorphism.aComposition;

public class Lamp {
	
	private String style;
	private boolean battery;
	private int glowRating;
	
	public Lamp(String style, boolean battery, int glowRating) {
		
		this.style = style;
		this.battery = battery;
		this.glowRating = glowRating;
	}
	
	public void turnOn() {
		System.out.println("Lamp -> Turning ON!");
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlowRating() {
		return glowRating;
	}

}
