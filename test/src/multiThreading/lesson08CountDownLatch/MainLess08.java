package multiThreading.lesson08CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Sergii Bugaienko
 */

public class MainLess08 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executorService.submit(new ProcessorWait(i, countDownLatch));
        }
        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Latch has been opened, main Thread is proceeding");
    }
}
