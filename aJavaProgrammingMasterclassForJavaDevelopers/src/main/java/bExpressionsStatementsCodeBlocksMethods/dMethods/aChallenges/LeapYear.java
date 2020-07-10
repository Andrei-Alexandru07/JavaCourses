package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1967));
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if ((year >= 1) && (year <= 9999)) {
            int x = year % 4;
            int y = year % 100;
            if (((x==0) && (y!=0)) || (year % 400 == 0)) {
                result = true;
            }
            else {
                result = false;
            }
        }
        return result;

    }
}
