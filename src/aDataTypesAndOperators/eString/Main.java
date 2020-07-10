package aDataTypesAndOperators.eString;

public class Main {

    public static void main(String[] args) {

        /* Primitive Data Types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean */

        //String is not a primitive type but a CLASS.

        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to : " + myString);

        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to : " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is :" + numberString);

        String lastString = "10";
        int myInt = 50;
        double yourInt = 60.566d;
        lastString = lastString + myInt + yourInt;
        System.out.println("Last string is equal to :" + lastString);

    }
}
