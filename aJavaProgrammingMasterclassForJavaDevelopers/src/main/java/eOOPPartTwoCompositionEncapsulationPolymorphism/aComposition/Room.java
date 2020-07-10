package eOOPPartTwoCompositionEncapsulationPolymorphism.aComposition;

public class Room {
	
	private int dimensions;
	private String name;
	private int level;
	private Windows windows;
	private Door doors;
	
	public Room(int dimensions, String name, int level, Windows windows, Door doors) {
		
		this.dimensions = dimensions;
		this.name = name;
		this.level = level;
		this.windows = windows;
		this.doors = doors;
	}
	
	public void doorsOpen() {
		doors.openDoor();
	}
	public void doorsClose() {
		doors.closeDoor();
	}

	public int getDimensions() {
		return dimensions;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public Windows getWindows() {
		return windows;
	}
	
	
	
	

}
