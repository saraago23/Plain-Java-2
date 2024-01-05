package concurrency.u1.u2;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i =0;i<4;i++){
            System.out.println(Thread.currentThread() + ", " + i);
        }
    }
}
