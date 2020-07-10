package bExpressionsStatementsCodeBlocksMethods.bStatementsWhitespaceIndentation;

public class Main {

    public static void main(String[] args) {

        //A expression is : myVariable = 50
        //A statement is : int myVariable = 50;
        int myVariable = 50;
        myVariable++;  //statement
        myVariable--;  //statement

        System.out.println("This is my variable: "
                + myVariable
                + " !");  // The all 3 lines from above are also a statement!

        // You also can write 3 statements on the same line! Not recommended because it's hard to read!
        int anotherVariable = 50;
        myVariable--;
        System.out.println("this is another one : " + anotherVariable);

    }
}
