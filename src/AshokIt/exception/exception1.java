package AshokIt.exception;

import java.sql.SQLOutput;

public class exception1 {
    public static void main(String[] args) {
        try{
            System.out.println("Try Started");
            int i=10/0;

        }catch (Exception E){
            System.out.println("CAtch Started");

        }
    }
}
