package Misccode;
import java.util.Scanner;
public class factorial {
    static int fact=1;
    public static void main(String[] args) {

        System.out.print("Enter a no: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
