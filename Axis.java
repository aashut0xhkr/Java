package Conditionals;
import java.util.Scanner;
public class Axis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Value of x axis:  ");
        int x=sc.nextInt();
        System.out.print("Enter the Value of y axis:  ");
        int y=sc.nextInt();
        if(x==0){
            System.out.println("It lies on y axis");
        } else if (y==0) {
            System.out.println("It lies on x axis");
        }
        
    }

}
