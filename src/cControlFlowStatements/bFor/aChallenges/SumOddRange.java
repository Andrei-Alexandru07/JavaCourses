package cControlFlowStatements.bFor.aChallenges;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(0,96));
    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if((start>=0 && end>=start)){
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }

            }
        }
        else{
            return -1;
        }
        return sum;
    }

}
