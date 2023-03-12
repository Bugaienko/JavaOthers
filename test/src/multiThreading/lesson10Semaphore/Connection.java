package multiThreading.lesson10Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Sergii Bugaienko
 */

public class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (this) {
            connectionsCount--;
        }
    }

}
