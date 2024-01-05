package concurrency.u1;

public class Thread1 extends Thread{

    @Override
    public void run(){
        System.out.println("My first thread");

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("I woke up");
        }

        System.out.println( "One second has passed and I'm awake");
    }
}
