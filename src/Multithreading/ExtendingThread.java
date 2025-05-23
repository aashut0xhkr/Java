package Multithreading;

public class ExtendingThread extends Thread {
    public static void main(String[] args) {
        ExtendingThread e=new ExtendingThread();
         Thread t=new Thread(e);  t.start();}


    public void run() {
        System.out.println("Run");
    }
}
