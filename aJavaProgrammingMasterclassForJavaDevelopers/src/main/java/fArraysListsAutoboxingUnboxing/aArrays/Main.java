package fArraysListsAutoboxingUnboxing.aArrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int myIntVariable = 50;

        int[] myIntVariableArray = new int[25];
//        myIntVariableArray[0] = 45;
//        myIntVariableArray[1] = 476;
//        myIntVariableArray[5] = 40;

        double[] myDoubleVariableArray = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};

        System.out.println(myDoubleVariableArray[0] + ", " + myDoubleVariableArray[1] + ", " + myDoubleVariableArray[3]);

        for (int i = 0; i < myIntVariableArray.length; i++) {
            myIntVariableArray[i] = i*10;
        }

        printArray(myIntVariableArray);
//#####################################################################################################################
    int[] myIntegers = getIntegers(5);
    for (int i = 0; i < myIntegers.length; i++){
        System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
    }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter number " + (i+1));
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
