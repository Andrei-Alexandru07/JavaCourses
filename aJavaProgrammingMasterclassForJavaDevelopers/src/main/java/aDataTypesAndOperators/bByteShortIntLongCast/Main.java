package aDataTypesAndOperators.bByteShortIntLongCast;

public class Main {

    public static void main(String[] args) {


    //byte has a width of 8 bits
    byte myMinByteValue = -128;
    byte myMaxByteValue = 127;
    byte myNewByteValue = (byte) (myMaxByteValue/2);
        System.out.println("My new byte value is : " + myNewByteValue);

    //short has a width of 16 bits
    short myMinShortValue = -32_768;
    short myMaxShortValue = 32_767;
    short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println("My new short value is : " + myNewShortValue);

        //int has a width of 32 bits
        int myIntMinValue = -2_147_483_648;
        int myIntMaxValue = 2_147_483_647;
        int myTotal = (myIntMinValue/2);
        System.out.println("My total is : " + myTotal);

    //long has a width of 64 bits
    long myMinLongValue = -9_223_372_036_854_775_808L;
    long myMaxLongValue = 9_223_372_036_854_775_807L;

    //exercise
    byte var1 = 10;
    short var2 = 200;
    int var3 = 100_000;
    long sumOfVar123 = 50_000L + 10L * (var1 + var2 + var3);
        System.out.println("The sum of var1,2,3 is : "+sumOfVar123);
    short shortTotal = (short) (1000 + 10 * (var1 +var2));
        System.out.println("The short value is : " + shortTotal);
    }
}
