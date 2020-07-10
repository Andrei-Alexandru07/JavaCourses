package dOOPPartOneClassesConstructorsInheritance.cThisVsSuper;

public class Rectangle extends Shape {
   private int width;
   private int height;

    public Rectangle(int x, int y) {
        this(x, y,0,0);
        System.out.println("1'st Rectangle() constructor called!");
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
        System.out.println("2'nd Rectangle() constructor called!");
    }
}
