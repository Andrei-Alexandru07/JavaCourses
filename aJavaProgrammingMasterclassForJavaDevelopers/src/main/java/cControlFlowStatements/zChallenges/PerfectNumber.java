package cControlFlowStatements.zChallenges;

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumOfFactors=0;

        for (int i=1; i<number; i++){
            if ( number % i == 0){
                sumOfFactors += i;
            }
        }
        return (sumOfFactors == number);
    }

}
