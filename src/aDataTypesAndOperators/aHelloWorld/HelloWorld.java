package aDataTypesAndOperators.aHelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println ("hello TIMberlake");

        int myFirstNumber = (10 + 10) * 3;
        String myString = "My first number is : ";
        System.out.println(myString + myFirstNumber + "!");

        int mySecondNumber = 20;
        int myThirdNumber = 30;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        String myTotalString = "My total is : ";
        System.out.println(myTotalString + myTotal + "!");

        double myDifference = 100000.989 - myTotal;
        String myDifferenceString = "My difference is : ";
        System.out.println(myDifferenceString + myDifference + "!");

    }
}
