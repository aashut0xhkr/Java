package java8.com;

import java.util.function.Supplier;

public class SupplierOTPgen {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String otp="";
            for (int i = 1; i <=5 ; i++) {
                otp=otp + (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
