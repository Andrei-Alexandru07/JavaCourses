package eOOPPartTwoCompositionEncapsulationPolymorphism.aComposition;

public class Main {
	
	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		thePC.powerUp();

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GEORGE METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

		DoorDimensions doorDimensions = new DoorDimensions(24, 1, 100);
		Door door = new Door("Brown", doorDimensions, "wood");
		
		WindowsDimensions windowsDimensions = new WindowsDimensions(15, 1, 80);
		Windows windows = new Windows(4, "Rectangular", windowsDimensions);
		
		Room theRoom = new Room(100, "Bedroom", 1, windows, door);
		
		theRoom.doorsOpen();
		theRoom.doorsClose();
		theRoom.getWindows().closeWindow();
		theRoom.getWindows().openWindow();
		
//#######################################~~~TIM METHOD~~~#################################################
		
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		
		Ceiling ceiling = new Ceiling(12, 55);
		
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		
		Lamp lamp = new Lamp("Classic", false, 75);
		
		Bedroom bedRoom = new Bedroom("George", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedRoom.getLamp().turnOn();
		bedRoom.makeBed();
	}

}
