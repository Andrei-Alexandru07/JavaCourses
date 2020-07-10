package cControlFlowStatements.eReadingUserInput.aChallenges;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean quit = false;
        while (!quit){
            if (scanner.hasNextInt()){
                int x=scanner.nextInt();
                sum += x;
                count++;
            } else if (count == 0){
                System.out.println("SUM = " + 0 + " AVG = " + String.format("%.6f", (double) 0 ));
                //scanner.close();
                quit = true;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + String.format("%.6f", ((double) sum/count)));
                //scanner.close();
                quit = true;
            }
            if (!quit) {
                scanner.nextLine();
            }
        }
    }
}