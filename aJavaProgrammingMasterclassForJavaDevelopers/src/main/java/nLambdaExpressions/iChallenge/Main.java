package nLambdaExpressions.iChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Challenge 1: Write the following anonymous class as a lambda expression
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this into an array";
                String[] parts = myString.split(" ");
                for(String part : parts)
                    System.out.println(part);
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this into an array";
            String[] parts = myString.split(" ");
            for(String part : parts)
                System.out.println(part);
        };

        Function<String, String> myFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharacter(myFunction, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java!";

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);


        System.out.println("===========================");
        List<String> topNames2021 = Arrays.asList(
          "Amelia",
          "Olivia",
          "emily",
          "Isla",
          "Ava",
          "oliver",
          "Jack",
          "Charlie",
          "harry",
          "Jacob"
        );

        List<String> capitalizedList = new ArrayList<>();
        topNames2021.forEach(name ->
                capitalizedList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));

        capitalizedList.sort(String::compareTo);
        capitalizedList.forEach(System.out::println);
        System.out.println("===========================");

        long nameWithA = topNames2021.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("Names that starts with A: " + nameWithA);
        System.out.println("=============================");
        List<String> capitalizedList2 = topNames2021.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());
    }

    private static String everySecondCharacter(Function<String, String> function, String string) {
        return function.apply(string);
    }
}
