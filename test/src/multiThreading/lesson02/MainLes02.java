package multiThreading.lesson02;

import java.util.Scanner;

public class MainLes02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }

}
