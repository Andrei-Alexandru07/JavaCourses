package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,10));
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            result = false;
        }

        if (barking && (hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23)) {
            result = true;
        }
        return result;
    }
}


