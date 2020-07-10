package cControlFlowStatements.cWhileAndDoWhile;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count + ".");
            count++;
        }
        System.out.println();

    /*##~~~~~~~~~EQUIVALENT IN FOR LOOP~~~~~~~~~~~~##

        for(int i=1; i<6; i++){
            System.out.println("Count value is " + i + ".");
        }       */


        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count + ".");
            count++;
        }
        System.out.println();

        count = 6;
        do {
            System.out.println("Count value was " + count + ".");
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

/*~~~~~~~~~~~~~MY VERSION~~~~~~~~~~~~~~~~~~~~~~~~~~
        for (int i = 0; i <= 10; i++) {
            int x = isEvenNumber(i);
            if (x == 1){
                System.out.println(i + " is an even number");
            }
        } */

//~~~~~~~~~~~~~~~HIS VERSION~~~~~~~~~~~~~~~~~~~~~~

    int number = 5;
    int finishNumber = 20;
    int totalEvenNumbers = 0;

    while (number <= finishNumber) {
        number++;
        if (!isEvenNumber(number)) {
            continue;
        }

        System.out.println("Even Number is " + number + ".");

        totalEvenNumbers++;
        if(totalEvenNumbers >= 5) {
            break;
        }
    }
        System.out.println("Total even numbers found = " + totalEvenNumbers + ".");
    }
/*~~~~~~~~~~~MY VERSION~~~~~~~~~~~~~~~~~~~~
    public static int isEvenNumber (int number) {
        int i=0;
        while (i <= number) {
            int reminder = number % 2;

            if (number != 0 && reminder == 0) {
                return 1;
            }
            else return 0;
        }
        return -1;
    }       */

//~~~~~~~~~~~~~~~HIS VERSION~~~~~~~~~~~~~~~~~~~~~~

    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
