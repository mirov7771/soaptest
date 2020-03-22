package ru.amirov.test;

import java.util.Date;

/**
 * Многопоточность
 */
public class ManyThreadsTest {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();

        TestThread testThread1 = new TestThread();
        testThread1.start();

        System.out.println("i am go to sleep "+new Date().getTime());
        Thread.sleep(3000);
        System.out.println("i am awake "+new Date().getTime());

        Thread testRunnable = new Thread(new Runner());
        testRunnable.start();
        
        System.out.println("Hello world from thread");
    }
}

//1ый способ создания многопоточности
class TestThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<50;i++)
            System.out.println("Hello world "+i);
    }
}

//2ой способ создания многопоточности - лучше
class Runner implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Test runnable "+i);
        }
    }
}