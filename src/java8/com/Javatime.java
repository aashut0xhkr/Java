package java8.com;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Javatime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Date d=new Date();
//        System.out.println(d);
//        LocalDate ld=LocalDate.now();
//        System.out.println(ld);
//        LocalTime lt=LocalTime.now();
//        System.out.println(lt);
//        LocalDateTime ldt=LocalDateTime.now();
//        System.out.println(ldt);
        boolean leapYear=LocalDate.parse("2022-12-12").isLeapYear();
        System.out.println(leapYear);
    }
}
