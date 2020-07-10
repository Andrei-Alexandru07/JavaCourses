package cControlFlowStatements.dParsingValuesFromString;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        double number1 = Double.parseDouble(numberAsString);
        System.out.println("number1 = " + number1);
        float number2 = Float.parseFloat(numberAsString);
        System.out.println("number2 = " + number2);

        numberAsString += number;
        number += number;
        System.out.println("numberAsString = " + numberAsString + ' ' + "number = " + number);

    }
}
