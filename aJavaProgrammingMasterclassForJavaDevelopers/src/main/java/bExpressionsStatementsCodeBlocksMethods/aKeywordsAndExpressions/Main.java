package bExpressionsStatementsCodeBlocksMethods.aKeywordsAndExpressions;

public class Main {

    public static void main(String[] args) {

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");

            int score = 100;                                        //expression is: score = 100
            if (score > 99) {                                       //expression is: score > 99;
                System.out.println("You've got the highscore!");    //expression is: "You've got the high score!"
                score = 0;                                          //expression is: score = 0;
            }
        }
    }
}
