package multiThreading.lesson10Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Sergii Bugaienko
 */

public class MainLesson10Semaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        try {
            semaphore.acquire(); // взять одно разрешение
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release(); // отдать разрешение
        System.out.println(semaphore.availablePermits());
    }
}
