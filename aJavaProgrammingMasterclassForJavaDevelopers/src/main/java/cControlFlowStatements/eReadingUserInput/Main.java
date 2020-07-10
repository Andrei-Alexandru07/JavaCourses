package cControlFlowStatements.eReadingUserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a = "20";
        int x = Integer.parseInt(a) + 1;
        System.out.println(x);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine();  // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - year;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name + " and your age is " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        }
        else {
            System.out.println("Please enter your year of birth in  numbers.");
        }
        scanner.close();
    }
}
