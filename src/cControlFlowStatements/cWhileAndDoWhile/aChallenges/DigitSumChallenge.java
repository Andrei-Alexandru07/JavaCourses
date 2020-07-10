package cControlFlowStatements.cWhileAndDoWhile.aChallenges;

public class DigitSumChallenge {

    public static void main(String[] args) {

        int x=0;
        for ( int i = 10; i <= 2500; i+=5){

            System.out.println(sumDigits(i));
            x = x+sumDigits(i);
        }
        System.out.println(x);

    }

    public static int sumDigits (int number){
        if (number < 10) {
            return-1;
        }

        int sum=0;

        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;
            //drop the least significant digit
            number /= 10; //same as : number = number / 10;
        }
        return sum;

    }
}
