package cControlFlowStatements.aSwitch;

public class Main {

    public static void main(String[] args) {

/*	    int value = 2;
	    if (value == 1) {
            System.out.println("Value was 1.");
        } else if (value == 2) {
            System.out.println("Value was 2.");
        } else {
            System.out.println("Was not 1 or 2.");
        }
*/

//##~~~~~~~~~~~~Alternative to IF ELSE statement!~~~~~~~~~~~~~~##

        int switchValue = 6;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.println("Value was 2.");
                break;

            case 3: case 4: case 5:
                System.out.println("Was 3, or 4, or 5.");
                System.out.println("Actually it was a " + switchValue + ".");
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5.");
                break;
        }

        //##~~~~~~~~~~CHALLENGE~~~~~~~~~~##

        char switchedLetter = 'D';

	    switch (switchedLetter) {
            case 'A':
                System.out.println("Letter was A.");
                break;

            case 'B':
                System.out.println("Letter was B.");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Letter was C,D, or E.");
                System.out.println("Actually it was " + switchedLetter + ".");
                break;

            default:
                System.out.println("Letter wasn't A,B,C,D or E.");
                System.out.println("Actually it was " + switchedLetter + ".");
                break;
        }

        String month = "January";

	    switch (month.toLowerCase()) {  //xxxx.toLowerCase is a method which transforms the input string to lower case string.
            case "january":
                System.out.println("Month was " + month + ".");
                break;

            case "february":
                System.out.println("Month was " + month + ".");
                break;

            case "march":
                System.out.println("Month was " + month + ".");
                break;

            default:
                System.out.println("No winter month was selected.");
        }

        //More code here.
    }
}
