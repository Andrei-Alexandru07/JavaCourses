package bExpressionsStatementsCodeBlocksMethods.cIfThenElseControlStatements;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

/*        if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score was less than 5000 but greater than 1000! " + score);
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000! " + score);
        } else {
            System.out.println("Got here! " + score);
        }
*/
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        //~~~~~~~~~~~~~~~~~~FIRST SOLUTION~~~~~~~~~~~~~~~~~~~~~~~~

      int secondScore = 10_000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (gameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second final score was: " + finalScore);
        }

        //~~~~~~~~~~~~~~~~~~SECOND SOLUTION~~~~~~~~~~~~~~~~~~~~~~~~

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

        }
    }
}
