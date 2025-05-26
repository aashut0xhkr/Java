package Multithreading;
import java.util.*;
public class DaemonThread implements Runnable{

    @Override
    public void run() {
            if(Thread.currentThread().isDaemon()){
                System.out.println("Daemon Thread");
            }
            else{
                System.out.println("Normal Thread");
            }
    }

    public static void main(String[] args) {
        DaemonThread d=new DaemonThread();
        Thread t=new Thread(d);
        // t.setDaemon(true);
        t.start();
    }
}
