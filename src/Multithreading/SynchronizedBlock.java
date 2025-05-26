package Multithreading;
import java.lang.*;
public class SynchronizedBlock implements Runnable {
    public static void main(String[] args)  {
        SynchronizedBlock sb=new SynchronizedBlock();
        Thread t=new Thread(sb);
        t.start();
        Thread t1=new Thread(sb);
        t1.start();

    }
    @Override
    public void run() {
        print();
    }
    public synchronized void print() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
