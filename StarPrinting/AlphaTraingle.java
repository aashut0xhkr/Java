package StarPrinting;

import java.util.Scanner;
public class AlphaTraingle {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=Sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print((char) (j+64) );
            }
            System.out.println();
        }

    }
}