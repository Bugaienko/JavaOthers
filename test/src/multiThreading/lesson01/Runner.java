package multiThreading.lesson01;

public class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from Runner " + i);
        }
    }
}
