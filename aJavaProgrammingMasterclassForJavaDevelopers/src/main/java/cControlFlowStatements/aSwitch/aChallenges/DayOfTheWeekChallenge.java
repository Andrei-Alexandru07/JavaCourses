package cControlFlowStatements.aSwitch.aChallenges;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {

        System.out.println("FIRST SOLUTION");
        for (int i=-1; i<=7; i++){
            printDayOfWeek(i);
        }
        System.out.println("SECOND SOLUTION");
        for (int i=-1; i<=7; i++){
            printDayOfWeek2(i);
        }
    }

    private static void printDayOfWeek(int day) {

        if (day < 0 || day > 6) {
            System.out.println("Invalid day");
        } else if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }

    private static void printDayOfWeek2(int day) {
        switch(day) {
            default:
                System.out.println("Invalid day.");
                break;
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;

        }
    }
}
