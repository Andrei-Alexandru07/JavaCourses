package bExpressionsStatementsCodeBlocksMethods.dMethods.aChallenges;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(12,24,33));
    }

    public static boolean hasTeen (int par1, int par2, int par3) {
        boolean result = false;
        if (((par1>=13)&&(par1<=19)) || ((par2>=13)&&(par2<=19)) || ((par3>=13)&&(par3<=19))) {
            result = true;
        }
        return result;
    }
}
