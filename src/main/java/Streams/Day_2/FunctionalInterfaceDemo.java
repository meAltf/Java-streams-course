package Streams.Day_2;

@FunctionalInterface
interface Greet {
    void sayHello(String name);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Greet greet = name -> System.out.println("Hello, " + name + " Welcome!");
        greet.sayHello("Robert");
    }
}
