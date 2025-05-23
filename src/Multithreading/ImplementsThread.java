package Multithreading;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ImplementsThread  implements Runnable{
    public void run(){
        try{

        Thread.sleep(5000);}
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Run");
    }
    public static void main(String[] args) {
        ImplementsThread i=new ImplementsThread();
        Thread t =new Thread(i);
        t.start();
    }
}
