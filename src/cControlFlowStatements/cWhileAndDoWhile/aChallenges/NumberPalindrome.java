package cControlFlowStatements.cWhileAndDoWhile.aChallenges;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;

        while (number!=0){

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
            System.out.println("number = " + number);

        }
        return reverse == num;


    }

}
