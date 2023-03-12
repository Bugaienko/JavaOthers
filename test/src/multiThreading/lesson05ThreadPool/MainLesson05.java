package multiThreading.lesson05ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Sergii Bugaienko
 */

public class MainLesson05 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }

        executorService.shutdown();
        System.out.println("All task submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
