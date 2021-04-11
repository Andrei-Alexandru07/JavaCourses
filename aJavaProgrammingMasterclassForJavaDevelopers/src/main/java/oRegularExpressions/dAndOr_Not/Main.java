package oRegularExpressions.dAndOr_Not;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        int count = 0;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence: " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        System.out.println("---------------Phone number test---------------");
        String phoneReg = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        String phone1 = "1234567890"; //Shouldn't match
        String phone2 = "(123) 456-7890"; //match
        String phone3 = "123 456-7890"; //Shouldn't match
        String phone4 = "(123)456-7890"; //Shouldn't match

        System.out.println("phone1 = " + phone1.matches(phoneReg));
        System.out.println("phone2 = " + phone2.matches(phoneReg));
        System.out.println("phone3 = " + phone3.matches(phoneReg));
        System.out.println("phone4 = " + phone4.matches(phoneReg));

    }
}
