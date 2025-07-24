package Streams.Day_1;

// Without Lambda
/**
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Running the thread");
    }
};
new Thread(r1).start();

**/

public class DemoLambda {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Running the thread...");
        new Thread(runnable).start();

    }
}
