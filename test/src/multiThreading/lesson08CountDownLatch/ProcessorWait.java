package multiThreading.lesson08CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Sergii Bugaienko
 */

public class ProcessorWait implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;

    public ProcessorWait(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread with id " + id + " proceeded.");
    }
}
