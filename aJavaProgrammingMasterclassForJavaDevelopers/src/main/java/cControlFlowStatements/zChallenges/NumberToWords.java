package cControlFlowStatements.zChallenges;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(34);
        numberToWords(121);
        numberToWords(4917);
    }

    public static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int digitCount = getDigitCount(number);
        int reverseNumber = reverse(number);
        String word = "";

        while (digitCount > 0) {

            switch (reverseNumber % 10){

                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
            }
            System.out.println(word);
            reverseNumber /= 10;
            digitCount--;
        }
        System.out.println();
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int digitCount=0;
        if (number == 0) {
            digitCount=1;
        }

        while (number != 0){
            number = number / 10;
            digitCount++;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number!=0){

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        return reverse;
    }


}
