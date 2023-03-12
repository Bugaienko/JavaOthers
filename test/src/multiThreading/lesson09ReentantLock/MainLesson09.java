package multiThreading.lesson09ReentantLock;

/**
 * @author Sergii Bugaienko
 */

public class MainLesson09 {
    public static void main(String[] args) {


        Task task = new Task();
        Thread thread1 = new Thread(task::firstThread);

        Thread thread2 = new Thread(() -> {
            task.secondThread();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.showCounter();


    }
}
