package aDataTypesAndOperators.cFloadAndDouble;

public class Main {

    public static void main(String[] args) {
        // width of 32 bits
	    int myIntValue = 5 / 3;
	    // width of 32 bits
	    float myFloatValue = 5f / 3f;
	    // width of 64 bits (Most RECOMMENDED to USE)
	    double myDoubleValue = 5d / 3d;

        System.out.println("My int is : " + myIntValue);
        System.out.println("My float is : " + myFloatValue);
        System.out.println("My double is : " + myDoubleValue);

        double poundsNumber = 376d;
        double kilograms = poundsNumber * 0.45359237d;

        System.out.println("You have : " + kilograms + " Kg.");

        double pi = 3.141_592_7d;
        System.out.println("Pi number = " + pi);
    }
}
