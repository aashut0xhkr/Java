package java8.com;
import java.text.*;
import java.util.*;
public class DateAndTime {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);
    }

}
