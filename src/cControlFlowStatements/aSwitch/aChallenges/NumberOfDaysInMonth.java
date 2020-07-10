package cControlFlowStatements.aSwitch.aChallenges;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 1992));
        System.out.println(getDaysInMonth(2, 2001));
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if ((year >= 1) && (year <= 9999)) {
            int x = year % 4;
            int y = year % 100;
            if (((x == 0) && (y != 0)) || (year % 400 == 0)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }

    public static int getDaysInMonth(int month, int year) {
        int result;

        if ((year < 1) || (year > 9999)) {
            return -1;
        }

        boolean isLeapYEAR = isLeapYear(year);

        switch (month) {

            case 1:
                result = 31;
                break;
            case 2:
                if (isLeapYEAR) {
                    result = 29;
                } else {
                    result = 28;
                }
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
            default:
                result = -1;
                break;

        }
        return result;
    }
}
