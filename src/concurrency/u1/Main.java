package concurrency.u1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread is starting");

        Thread thread = new Thread1();
        thread.start();

        System.out.println("Main thread ended");
    }


}
