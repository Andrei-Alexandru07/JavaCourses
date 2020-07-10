package bExpressionsStatementsCodeBlocksMethods.eMethodOverloading.aChallenges;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(25));
        System.out.println(area(12, 14));
    }

    public static double area (double radius) {
        double result = 0;
        if (radius < 0) {
            result = -1;
        }
        else if (radius >= 0) {
            double pi = 3.14159;
            result = radius * radius * pi;
        }
        return result;
    }

    public static double area (double x, double y) {
        double result = 0;
        if ( (x < 0) || (y < 0) ) {
            result = -1;
        }
        else {
            result = x * y;
        }
        return result;
    }
}