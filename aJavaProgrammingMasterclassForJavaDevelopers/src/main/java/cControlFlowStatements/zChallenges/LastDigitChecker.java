package cControlFlowStatements.zChallenges;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(113, 11, 103));
        System.out.println(hasSameLastDigit(112,11,103));
    }

    public static boolean hasSameLastDigit (int num_1, int num_2, int num_3) {
        if ((num_1 >= 10) && (num_1 <= 1000) && (num_2 >= 1) && (num_2 <= 1000) && (num_3 >=10 && num_3 <=1000)) {


            int lastDigitNum_1 = num_1 % 10;
            int lastDigitNum_2 = num_2 % 10;
            int lastDigitNum_3 = num_3 % 10;

            if (lastDigitNum_1 == lastDigitNum_2 || lastDigitNum_1 == lastDigitNum_3 || lastDigitNum_2 == lastDigitNum_3) {
                return true;
            }
        }
        return false;
    }

}
