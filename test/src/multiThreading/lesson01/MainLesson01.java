package multiThreading.lesson01;

public class MainLesson01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

//        MyThread myThread1 = new MyThread();
//        myThread1.start();

        Thread thread = new Thread(new Runner());
        thread.start();

        for (int i = 0; i < 1000; i++) {
            Thread.sleep(50);
            System.out.println("Hello from main thread " + i);
        }
    }

}
