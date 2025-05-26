package java8.com;

import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter User id:  ");
        int userId=sc.nextInt();
        MsgService m=new MsgService();
        String s=m.Msg(userId);

        System.out.println(s+ ", Hello");
    }
}
