package gInterfacesInnerAndAbstractClases.fAbstractClases;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        dog.age();

        System.out.println();

        Parrot parrot = new Parrot("Australian ring neck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println();

        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
