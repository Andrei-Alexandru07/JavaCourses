package jJavaCollections.bCollectionsBinarySearchImplementation;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 26, 20);
       //theatre.getSeats();
        if(theatre.reserveSeat("A20")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

        if(theatre.cancelSeat("A20")) {
            System.out.println("The seat is now open for reservation");
        } else {
            System.out.println("There is no reservation for this seat.");
        }
    }
}
