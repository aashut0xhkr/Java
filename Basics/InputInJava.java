package Basics;
import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :  ");
        int a=sc.nextInt();
        System.out.println(a*a);
    }
}
