package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(10, 10,9));
    }

    public static boolean hasEqualSum (int par1, int par2, int par3) {

        boolean result = false;
        if(par1 + par2 == par3) {
            result=true;
        }
        return result;
    }

}
