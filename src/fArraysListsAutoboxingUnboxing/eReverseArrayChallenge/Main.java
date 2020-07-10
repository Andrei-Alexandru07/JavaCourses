package fArraysListsAutoboxingUnboxing.eReverseArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the lenght of your array: ");
		int[] myArr = readIntegers(scanner.nextInt());
		
		System.out.println("Array = " + Arrays.toString(myArr));
		
		System.out.println("Reversed Array = " + Arrays.toString(reverse(myArr)));
		
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
	
	public static int[] reverse (int[] array) {
		
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
//		int temp = 0;
		
		for(int i = 0; i< array.length; i++) {
			
			if(i < halfLength) {
				int temp = array[i];
				array[i] = array[maxIndex-i];
				array[maxIndex-i] = temp;
			}
		}
		return array;
	}
}
