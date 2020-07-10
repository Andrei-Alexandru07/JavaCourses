package bExpressionsStatementsCodeBlocksMethods.dMethods;



public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore + " !");

        int highScore2 = calculateScore(true, 10_000, 8, 200);
        System.out.println("Your final score was: " + highScore2 + " !");

        int highScorePosition = calculateHighScorePosition( 1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition( 50);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition( 900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition( 400);
        displayHighScorePosition("Luchs", highScorePosition);

        highScorePosition = calculateHighScorePosition( 5);
        displayHighScorePosition("Lenutza", highScorePosition);

        int highScorePosition2 = calculateHighScorePosition2(1000);
        displayHighScorePosition2("Ionel", highScorePosition2);

        highScorePosition2 = calculateHighScorePosition2(500);
        displayHighScorePosition2("Gigel", highScorePosition2);

        highScorePosition2 = calculateHighScorePosition2(100);
        displayHighScorePosition2("Mandricel", highScorePosition2);

        highScorePosition2 = calculateHighScorePosition2(50);
        displayHighScorePosition2("Pizdicel", highScorePosition2);


    }

    public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
            else
            return -1;

        }

    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
        }

    public static int calculateHighScorePosition (int playerScore) {
 /*       if (playerScore >= 1000) {
                return 1;
        }
            else if (playerScore >= 500) {
                return 2;
        }
            else if (playerScore >= 100) {
                return 3;
        }
         return 4;  */
        int position = 4; //assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500) {
            position = 2;
        }
        else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }


    public static void displayHighScorePosition2 (String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table!");
    }

    public static int calculateHighScorePosition2 (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }

}
