package Multithreading;
//import java.lang.*;
//import java.sql.SQLOutput;

public class MainThread {
    public static void main(String[] args) {
        Thread currentThread = getThread();
        System.out.println(currentThread.getName());
    }

    private static Thread getThread() {
        Thread currentThread=Thread.currentThread();
        return currentThread;
    }
}
