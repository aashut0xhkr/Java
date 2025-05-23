package com.LastPackage.ashok;
import java.util.Scanner;
public class Myinterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fname = sc.nextLine();
        String Lname = sc.nextLine();
        Myinterface m=new Myinterface();
        String s=m.naam(Fname,Lname);
        System.out.println(s);
    }


    public String naam(String str1,String str2){
        return str1 + str2;
    }
}
