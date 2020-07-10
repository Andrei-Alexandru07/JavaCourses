package hJavaGenerics.aGenerics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Without GENERICS
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("tim");   // Da eroare in timpul executiei
        items.add(4);
        items.add(5);

        printDouble(items);

        // With GENERICS

        ArrayList<Integer> items1 = new ArrayList<>();
        items1.add(1);
        items1.add(2);
        items1.add(3);
        //items1.add("tim");   // Da eroare inainte de compilare
        items1.add(4);
        items1.add(5);

        printDouble(items1);
    }
        // Without GENERICS
     private static void printDouble(ArrayList items){
        for (Object i : items) {
            System.out.println((Integer) i * 2);
        }
    }
        //With GENERICS
    private static void printDouble1(ArrayList<Integer> items){
        for (Integer i : items){
            System.out.println(i * 2);
        }
    }
}
