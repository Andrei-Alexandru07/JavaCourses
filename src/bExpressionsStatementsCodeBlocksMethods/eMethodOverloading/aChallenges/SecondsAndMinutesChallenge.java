package bExpressionsStatementsCodeBlocksMethods.eMethodOverloading.aChallenges;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(610L,10L));

        System.out.println(getDurationString(36610L ));
        // write your code here
    }

    private static String getDurationString (long minutes, long seconds) {
        String returnedString = INVALID_VALUE_MESSAGE;
        String hourString = "";
        String minuteString = "";
        String secondsString = "";
        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            long hour = minutes / 60;
            long remainingMinutes = minutes % 60;

            if (hour < 10) {
                hourString ="0" + hour + "h ";
            }
            else {
                hourString = hour + "h ";
            }

            if (remainingMinutes < 10) {
                minuteString ="0" + remainingMinutes + "m ";
            }
            else {
                minuteString = remainingMinutes + "m ";
            }
            if (seconds < 10) {
                secondsString ="0" + seconds + "s ";
            }
            else {
                secondsString = seconds + "s ";
            }

            returnedString = hourString + minuteString + secondsString;
        }
        return returnedString;
    }

    private static String getDurationString (long seconds) {
        String returnedString = INVALID_VALUE_MESSAGE;
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            returnedString = getDurationString(minutes, remainingSeconds);
        }
        return returnedString;
    }
}
