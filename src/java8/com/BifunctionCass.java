package java8.com;

import java.util.function.BiFunction;

public class BifunctionCass {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bf=(i,j)->i+j;
        System.out.println(bf.apply(1,2));
    }
}
