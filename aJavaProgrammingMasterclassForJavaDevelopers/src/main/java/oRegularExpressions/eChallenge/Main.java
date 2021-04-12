package oRegularExpressions.eChallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Challenge 1

        System.out.println("-----------------Challenge 1--------------");

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        System.out.println("-----------------Challenge 2--------------");

        String ch2Exp = "I want a .+\\.";
        System.out.println("Challenge 1: " + challenge1.matches("I want a bike."));
        System.out.println("Challenge 2: " + challenge1.matches(ch2Exp));
        System.out.println("Challenge 2: " + challenge2.matches(ch2Exp));

        //Challenge 3

        System.out.println("-----------------Challenge 3--------------");

        Pattern ch3Pattern = Pattern.compile(ch2Exp);
        Matcher ch3Matcher = ch3Pattern.matcher(challenge1);

        System.out.println("Ch3 Bike: " + ch3Matcher.matches());
        ch3Matcher = ch3Pattern.matcher(challenge2);
        System.out.println("Ch3 Ball: " + ch3Matcher.matches());

        System.out.println("-----------------Challenge 4--------------");

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println("Challenge 4: " + challenge4.replaceAll("\\s", "_"));

        System.out.println("-----------------Challenge 5--------------");

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println("Challenge 5: " + challenge5.matches("[abcdefg]*"));

        System.out.println("-----------------Challenge 6--------------");
        System.out.println("Challenge 6: " + challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        System.out.println("-----------------Challenge 7--------------");

        String challenge7 = "abcd.135";
        System.out.println("Challenge 7: " + challenge7 + " ---> " + challenge7.matches("^\\D+\\.\\d+$"));

        System.out.println("-----------------Challenge 8--------------");


        String challenge8 = "abcd.123uvqz.7tzik.999";
        String ch8Exp = "(\\D\\.)(\\d+)";
        Pattern ch8Pattern = Pattern.compile(ch8Exp);
        Matcher ch8Matcher = ch8Pattern.matcher(challenge8);

        while(ch8Matcher.find()) {
            System.out.println("Challenge 8: " + ch8Matcher.group(2));
        }

        System.out.println("-----------------Challenge 9--------------");

        String challenge9 = "abcd.123\tuvqz.7\ttzik.999\n";
        String ch9Exp = "(\\D\\.)(\\d+)\\s";
        Pattern ch9Pattern = Pattern.compile(ch9Exp);
        Matcher ch9Matcher = ch9Pattern.matcher(challenge9);

        while(ch9Matcher.find()) {
            System.out.println("Challenge 9: " + ch9Matcher.group(2));
        }

        System.out.println("-----------------Challenge 10--------------");

        String challenge10 = "abcd.123\tuvqz.7\ttzik.999\n";
        String ch10Exp = "[\\D]+\\.(\\d+)\\s";
        Pattern ch10Pattern = Pattern.compile(ch10Exp);
        Matcher ch10Matcher = ch10Pattern.matcher(challenge10);

        while(ch10Matcher.find()) {
            System.out.println("Challenge 10: from " + ch10Matcher.start(1) + " to " + (ch10Matcher.end(1) - 1));
        }

        System.out.println("-----------------Challenge 11--------------");

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String ch11Exp = "[{](.+?)[}]";
        Pattern ch11Pattern = Pattern.compile(ch11Exp);
        Matcher ch11Matcher = ch11Pattern.matcher(challenge11);

        while(ch11Matcher.find()) {
            System.out.println("Challenge 10: " + ch11Matcher.group(1));
        }

        System.out.println("-----------------Challenge 12--------------");

        String zipCodeExp = "^[0-9]{5}$";
        System.out.println("11111".matches(zipCodeExp));

        System.out.println("-----------------Challenge 13--------------");

        String zipCodeExp2 = "^[0-9]{5}-[0-9]{4}$";
        System.out.println("11111-1111".matches(zipCodeExp2));

        System.out.println("-----------------Challenge 14--------------");

        String zipCodeExp3 = "^[0-9]{5}(-[0-9]{4})?$";
        System.out.println("11111-1111".matches(zipCodeExp3));
        System.out.println("11111".matches(zipCodeExp3));

    }
}
