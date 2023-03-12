package multiThreading.lesson01;

public class MyThread extends Thread {
    public void run(){
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread " + i);
        }
    }

}
