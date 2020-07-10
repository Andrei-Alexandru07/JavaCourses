package cControlFlowStatements.zChallenges;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(123,981));
        System.out.println(hasSharedDigit(123,456));
    }

    public static boolean hasSharedDigit (int num_1, int num_2) {
        if ((num_1 >= 10) && (num_1 <= 99) && (num_2 >= 10) && (num_2 <= 99)) {


            int lastDigitNum_1 = num_1 % 10;
            int lastDigitNum_2 = num_2 % 10;

            int firstDigitNum_1 = num_1 / 10;
            int firstDigitNum_2 = num_2 / 10;

            return (lastDigitNum_1 == lastDigitNum_2 || lastDigitNum_1 == firstDigitNum_2 || firstDigitNum_1 == firstDigitNum_2 || firstDigitNum_1 == lastDigitNum_2);

        }
        return false;
    }
}
