package aDataTypesAndOperators.dCharAndBoolean;

public class Main {

    public static void main(String[] args) {
        // width of 16 bits (2 bytes)
        char myChar = '\u004B';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;

        char registeredSign = '\u00AE';
        System.out.println("The registered sign is : " + registeredSign);
    }
}
