package java8.com;

import com.sun.security.jgss.GSSUtil;

import java.util.StringJoiner;

public class joiner {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("-","(",")");
        sj.add("Ashutosh");
        sj.add("Rajput");
        sj.add("Harsh");
        System.out.println(sj);
    }
}
