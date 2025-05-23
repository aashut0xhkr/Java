package java8.com;

import java.util.Date;

interface a{
    default void  ashu(){
        System.out.println(100);
    }
    abstract void ab();
    static void ashutosh(){
        System.out.println("Car start");
    }
}
class car implements a{
    public void ab(){
        System.out.println(100);
    }
    public void ashu( ){
        System.out.println(200);
    }
}
public class InterfaceChanges{
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        car c=new car();
        c.ab();
        c.ashu();
        a.ashutosh();
    }
}
