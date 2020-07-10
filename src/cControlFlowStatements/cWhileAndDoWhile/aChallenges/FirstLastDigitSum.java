package cControlFlowStatements.cWhileAndDoWhile.aChallenges;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(34569));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;

        while(number != 0){
            if (number < 10){
                lastDigit = number;
            }
            number = number / 10;
        }
        return (firstDigit + lastDigit);
    }

}
