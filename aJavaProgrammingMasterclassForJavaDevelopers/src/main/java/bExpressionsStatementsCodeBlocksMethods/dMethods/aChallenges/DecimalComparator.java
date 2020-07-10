package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(923.2326,923.232));
    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        boolean result=false;

        number1=number1*1000;
        number2=number2*1000;
        int difference =(int) (number1 - number2);
        if (difference == 0 ) {
            result = true;
        }
        return result;
    }

}
