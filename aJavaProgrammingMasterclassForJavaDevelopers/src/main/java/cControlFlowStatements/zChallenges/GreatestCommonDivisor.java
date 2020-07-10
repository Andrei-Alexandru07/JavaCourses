package cControlFlowStatements.zChallenges;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(252, 768));
        System.out.println(getGreatestCommonDivisor(20,20));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10) return -1;

        int min;
        int i = 1;
        int gcd = 1;

        min = (first <= second) ? first : second;

        while (i <= min){
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
