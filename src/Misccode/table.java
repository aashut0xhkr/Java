package Misccode;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            num+=num;
            System.out.println(num);
        }
    }
}
