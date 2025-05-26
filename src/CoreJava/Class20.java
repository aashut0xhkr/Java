//if_else
//Scanner_Class
//for_loop
//whileloop


package CoreJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Class20 {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i <=5 ; i++) {
            System.out.println(i);
        }
        //Scanner class
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        
        //card check
        for (int i = 0; i <=5 ; i++) {
            int pin=sc.nextInt();
            if(pin==1234){
                System.out.println("Welcome");
                break;
            }
            else{
                System.out.println("Try Again");
            }
            //while loop

            int x=0;
            while(x<5){
                System.out.println(x);
                x++;
            }
        }
    }
}
