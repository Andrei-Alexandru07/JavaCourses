package cControlFlowStatements.zChallenges;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(0,5,4));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        bigCount *= 5;
        return ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0) && (bigCount + smallCount >= goal) && ((smallCount >= goal % 5) || (goal - (bigCount + smallCount) == 0)));
    }
}