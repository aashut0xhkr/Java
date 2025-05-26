package AshokIt.exception;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i<=18){
            System.out.println("Eligible");
        }
        else{
            throw new InvalidNo("Not Eligible");
        }

    }
}
