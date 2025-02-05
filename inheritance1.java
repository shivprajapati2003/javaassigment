// File name should be inheritance1.java
public class inheritance1 {
    public static void main(String args[]) {
        fish shark = new fish(); // Create an instance of the fish class
        shark.eat(); // Call the inherited eat() method
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class / subclass
class fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}