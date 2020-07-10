package bExpressionsStatementsCodeBlocksMethods.eMethodOverloading;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("George", 250);
        System.out.println("New score is " + newScore + ".");

        int newScore2 = calculateScore(25);
        System.out.println("New score is " + newScore2 + ".");

        calculateScore();

        //##~~~~~~~~~~~~~~~CHALLENGE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~##

        double height = calcFeetAndInchesToCentimeters(17, 7);
        if (height > 0) {
            System.out.println("Height is equal to " + String.format("%.2f", height) + " centimeters.");
        } else System.out.println("Error!! Please enter parameters again.");


        height = calcFeetAndInchesToCentimeters(157);
        if (height > 0) {
            System.out.println("Height is equal to " + String.format("%.2f", height) + " centimeters.");
        } else System.out.println("Error!! Please enter parameters again.");
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score!");
        return 0;
    }
    //##~~~~~~~~~~~~~~~CHALLENGE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~##

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && ((inches) >= 0 && (inches <= 12))) {
            double result = (feet * 12 * 2.54) + (inches * 2.54);
            System.out.println("You introduced " + feet + " feet and " + inches + " inches.");
            return result;
        } else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else return -1;
    }
}
