package jJavaCollections.eMAps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled, high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");

        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println(languages.get("Java"));
        System.out.println(languages.containsKey("Java"));
        System.out.println(languages.put("Java", "This course is about Java"));
        System.out.println(languages.get("Java"));
        System.out.println(languages.get("BASIC"));

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map!");
        } else {
            languages.put("Java", "the best language in the world");
            System.out.println("Java added successfully!");
        }

        if (languages.containsKey("C#")){
            System.out.println("C# is already in the map!");
        } else {
            languages.put("C#", "Is a Microsoft copy of Java.");
            System.out.println("C# added successfully!");
        }

        System.out.println("=================ITERATING the MAP=========================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("================REMOVING ELEMENT===========================");
        if (languages.containsKey("C#")) {
            languages.remove("C#");
            System.out.println("C# was removed!");
        }

        System.out.println("=========REMOVING IF KEY contains a given VALUE=============");

        if (languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("Algol removed.");
        } else {
            System.out.println("Algol not removed, key/value pair not found.");
        }

        if (languages.remove("Algol", "An algorithmic language")){
            System.out.println("Algol removed.");
        } else {
            System.out.println("Algol not removed, key/value pair not found.");
        }

        System.out.println("=================ITERATING the MAP=========================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("=================REPLACING VALUE=========================");

        if (languages.replace("Lisp", "this will not replace it","A functional programming language with imperative features." )){
            System.out.println("Lisp replaced.");
        } else {
            System.out.println("Lisp wasn't replaced!");
        }

        System.out.println(languages.replace("Scala", "this will not be added."));

        if (languages.replace("Lisp", "Therein lies madness","A functional programming language with imperative features." )){
            System.out.println("Lisp replaced.");
        } else {
            System.out.println("Lisp wasn't replaced!");
        }

    }
}
