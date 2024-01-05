package concurrency.u1.u3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExercise{

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable myRunnable = new MyRunnable();

        executorService.execute(myRunnable);

        executorService.shutdown();
    }
}