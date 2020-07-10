package gInterfacesInnerAndAbstractClases.fAbstractClases;

public interface CanFly {
    void fly();

    default void eat(int x){
        System.out.println("I've eaten " + x + " pancakes today!");
    }
}
