package bExpressionsStatementsCodeBlocksMethods.eMethodOverloading.aChallenges;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,34));
        System.out.println(isCatPlaying(false,15));
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        boolean result = false;
        if (summer && ( (temperature >= 25) && (temperature <= 45)) ) {
            result=true;
        }
        else if (!summer && ( (temperature >= 25) && (temperature <= 35)) ) {
            result = true;
        }
        return result;

    }
}
