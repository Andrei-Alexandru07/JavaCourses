package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class SpeedConverter {
    // write your code here

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(100));
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        long x = Math.round(kilometersPerHour / 1.609);
        return x;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) + " mi/h");

    }
}
