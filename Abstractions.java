public class Abstractions {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Lion l = new Lion(); // Fixed class name capitalization
        l.eat();
        l.walk();
    }
}

abstract class Animal1 {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal1 {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Lion extends Animal1 { // Fixed class name capitalization
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
