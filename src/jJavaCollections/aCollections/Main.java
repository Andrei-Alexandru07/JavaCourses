package jJavaCollections.aCollections;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian",8,12);
        System.out.println(theatre.getTheatreName());
        //theatre.getSeats();

        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        double x = 'a' + 2;
        for (char ch = 'a'; ch<=x; ch++){
            System.out.println(ch);
        }
        System.out.println(Math.PI);

    }
}
