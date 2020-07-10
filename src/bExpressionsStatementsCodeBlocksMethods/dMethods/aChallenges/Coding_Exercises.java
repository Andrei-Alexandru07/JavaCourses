package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class Coding_Exercises {

    public static void main(String[] args) {

        System.out.println("areEqualByThreeDecimalPlaces RETURNS :"+ areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("areEqualByThreeDecimalPlaces RETURNS :" +  hasEqualSum(1,-1,0));

    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        boolean result=false;

        number1=number1*1000;
        number2=number2*1000;
        int difference =(int) (number1 - number2);
        if (difference == 0 ) {
            result = true;
        }
        return result;
    }

    public static boolean hasEqualSum (int par1, int par2, int par3) {

        boolean result = false;
        if(par1 + par2 == par3) {
            result=true;
        }
        return result;
    }
}
