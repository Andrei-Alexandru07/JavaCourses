package oRegularExpressions.bCharacterClassedAndBoudaryMatchers;

public class Main {
    public static void main(String[] args) {
        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        System.out.println(alphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));
    }
}
