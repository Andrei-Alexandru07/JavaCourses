package cControlFlowStatements.eReadingUserInput.aChallenges;

import java.util.Scanner;

public class MinMaxChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        int counter = 0;

        while (true) {
            counter++;
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int currentNumber = scanner.nextInt();

                if (currentNumber > max) {
                    max = currentNumber;
                }
                if (currentNumber < min) {
                    min = currentNumber;
                }
                if (counter == 1){
                    min = currentNumber;
                    max = currentNumber;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        scanner.nextLine();

        minMax();
        scanner.close();
    }
//##~~~~~~~~~~~~~~HIS SOLUTION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    private static void minMax (){

//        int min = 0;
//        int max = 0;
//        boolean first = true;   //flag for first iteration of while loop
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();

//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine(); // handles input.
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);



    }
}
