package fArraysListsAutoboxingUnboxing.bArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);


        printArray(sortArray(myIntegers));

       // int[] sorted = sortIntegers(myIntegers);
       // printArray(sorted);
        System.out.println(myIntegers[1]);

    }

    public static int[] getIntegers(int capacity) {

        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter element number " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " is: " + array[i]);
        }
    }

    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int[] sortArray(int[] array){
        int[] returnedArray = new int[array.length]; // the returned array
        int[] arrayCopy = Arrays.copyOf(array, array.length);  //the copy of the array which is passed to the function
        for (int i = 0; i < arrayCopy.length; i++) {
            int max = getMax(arrayCopy);
            returnedArray[i] = max;
            for (int j = 0; j < arrayCopy.length; j++) {
                if (max == arrayCopy[j]) {
                    arrayCopy[j] = 0;
                    break;
                }
            }
        }
        return returnedArray;
    }
//~~~~~~~~~~~~~~~~~~~~~~HIS SOLUTION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int[] sortIntegers(int[] array) {
                //        int[] sortedArray = new int[array.length];
                //        for (int i = 0; i < array.length; i++) {
                //            sortedArray[i] = array[i];
                //        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}




























