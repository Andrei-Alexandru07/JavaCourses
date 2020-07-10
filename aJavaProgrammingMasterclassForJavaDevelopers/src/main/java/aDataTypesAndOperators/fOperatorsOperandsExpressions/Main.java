package aDataTypesAndOperators.fOperatorsOperandsExpressions;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now: " + result);
        result++;
        System.out.println("Result is now: " + result);
        result--;
        System.out.println("Result is now: " + result);
        result += 2;
        System.out.println("Result is now: " + result);
        result *= 10;
        System.out.println("Result is now: " + result);
        result -= 10;
        System.out.println("Result is now: " + result);
        result /= 10;
        System.out.println("Result is now: " + result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
            else
            System.out.println("It is an alien!");

        int topScore = 80;
        if (topScore ==100)
            System.out.println("You got the high score!");

        int secondTopScore = topScore - 40;
        if (secondTopScore != 100)
            System.out.println("You don't have the high score!");

        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100.");

        if ((topScore >90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true!");

        boolean isCar = true;
        char litera = '\u00A2';
        if (isCar == false)
            System.out.println("This is not supposed to happen " + litera);

        boolean wasCar  = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

            double myFirstDouble = 20d;
            double mySecondDouble = 80d;
            double sumOfDoubles = (myFirstDouble + mySecondDouble) * 25d;
            System.out.println("The sum of doubles multiplied by 25 is : " + sumOfDoubles);
                double reminder = sumOfDoubles % 40d;
                System.out.println("The reminder is : " + reminder);

                    if (reminder <= 20)
                        System.out.println("Total was over the limit!");






    }
}
