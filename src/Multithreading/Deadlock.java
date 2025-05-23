package Multithreading;

public class Deadlock {

    public static void main(String[] args) throws Exception{
        String s1="Ashu";
        String s2="Tosh";
        Thread t1=new Thread(){
            @Override
            public void run() {
                synchronized (s1){
                    System.out.println("Resource 1");
                }
                synchronized (s2){
                    System.out.println("wating for resource 2");
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                synchronized (s2){
                    System.out.println("Resource 2");
                }
                synchronized (s1){
                    System.out.println("wating for resource 1");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
