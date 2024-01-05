package concurrency.u1.u2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        Thread thread = new Thread(new Thread2());
        thread.start();

        System.out.println("Main thread ended");
    }
}
