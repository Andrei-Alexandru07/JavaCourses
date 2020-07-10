package cControlFlowStatements.eReadingUserInput.aChallenges;

import java.io.IOException;
import java.util.Scanner;

public class ReadUSerInpuChallenge {

    public static void main(String[] args) throws IOException {

        Scanner scanNumbers = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter <= 10) {

            System.out.println("Please enter number " + counter + " :");

            boolean hasNextInt = scanNumbers.hasNextInt();

            if (hasNextInt) {
                int actualValue = scanNumbers.nextInt();
                sum = sum + actualValue;
                counter++;
            }
            else {
                System.out.println("Invalid Value!");
            }
            scanNumbers.nextLine();
        }
        System.out.println("sum =" + sum);
        scanNumbers.close();
    }
//##~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static void numbers (){

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            }
            else{
                System.out.println("Invalid number!");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum =" + sum);
        scanner.close();
    }
}
