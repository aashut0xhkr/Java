package com.streamapi.ashu;

import java.util.Arrays;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        List<String> al= Arrays.asList("John","Anushka","Robert","Anupma","Ashok");
        al.stream().filter(i->i.charAt(0)=='A').forEach(i-> System.out.println(i));
    }
}
