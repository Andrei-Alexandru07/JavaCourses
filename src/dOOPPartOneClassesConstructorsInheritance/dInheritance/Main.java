package dOOPPartOneClassesConstructorsInheritance.dInheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        Fish fish = new Fish("Salmon",25,500,6,2,2);
      //  dog.eat();
      //  dog.walk();
        dog.run();
        fish.swim(50);
        System.out.println(dog.getName());


    }
}
