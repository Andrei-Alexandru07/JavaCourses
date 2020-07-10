package fArraysListsAutoboxingUnboxing.dMinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the lenght of your array: ");
		int[] myIntegers = readIntegers(scanner.nextInt());
		System.out.println("My integer array = " + Arrays.toString(myIntegers));
		
		System.out.println("The minimum element of the array you entered is: " + findMin(myIntegers));
		System.out.println("The maximum element of the array you entered is: " + findMax(myIntegers));
		System.out.println("The sum of all elements of the array you entered is: " + sumOfElements(myIntegers));
		
	}
	
	private static int[] readIntegers (int count){
		
		int[] array = new int[count];
		
		System.out.println("Please enter " + count + " integers!");
			for(int i = 0; i < count; i++) {
				System.out.println("Enter element " + (i+1) + " out of " + count +":");
				array[i] = scanner.nextInt();
				scanner.nextLine();
			}
		return array;
	}
	
	private static int findMin (int[] array) {
		Arrays.sort(array);
		return array[0];
	}
	
	private static int findMax (int[] array) {
		Arrays.sort(array);
		return array[array.length-1];
	}
	
	private static int sumOfElements (int[] array) {
		int sum = 0;
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
		return sum;
	}
	

}
