package eOOPPartTwoCompositionEncapsulationPolymorphism.cEncapsulationChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(9);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());

        System.out.println(printer.addToner(51));
    }
}
