package multiThreading.lesson04;

import multiThreading.lesson03.Test;

/**
 * @author Sergii Bugaienko
 */

public class Test04 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
       new Worker().main();

    }

}
