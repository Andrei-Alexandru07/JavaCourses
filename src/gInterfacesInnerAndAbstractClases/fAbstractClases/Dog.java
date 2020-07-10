package gInterfacesInnerAndAbstractClases.fAbstractClases;

public class Dog extends Animal implements IAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe in, breathe out, repeat.");
    }

    @Override
    public void age() {
        System.out.println("Our dog is " + ageDog + " years old.");
    }
}
