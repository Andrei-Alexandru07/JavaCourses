package cControlFlowStatements.bFor;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000, 2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10_000, 3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10_000, 4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10_000, 5));

        // for(init; termination; increment) {}
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
//##~~~~~~~~~~~CHALLENGE ONE~~~~~~~~~~~~~~##

        for(int i=2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10_000.0, i)));
        }

        for(int i=8; i >= 2; i-=1) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10_000.0, i)));
        }
//##~~~~~~~~~~~CHALLENGE TWO~~~~~~~~~~~~~~##

        int count = 0;
        for(int i=10; i<50; i++) {
            if (isPrime_Enhanced(i)) {
                count++;
                System.out.println("Number " + i + " is s prime number!");
                if(count == 10) {
                    System.out.println("Exiting for loop!");
                    break;
                }
            }
        }
    }

    //##~~~~~~~~~~~CHALLENGE ONE~~~~~~~~~~~~~~##

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
    //##~~~~~~~~~~~CHALLENGE TWO~~~~~~~~~~~~~~##

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime_Enhanced(int n) {
        if(n==1) {
            return false;
        }
        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
