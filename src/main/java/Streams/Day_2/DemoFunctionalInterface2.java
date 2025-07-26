package Streams.Day_2;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class DemoFunctionalInterface2 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (c, d) -> c * d;

        System.out.println("Add operation: " + add.operate(5, 10));
        System.out.println("Multiply operation: " + multiply.operate(9, 89));
    }

}
