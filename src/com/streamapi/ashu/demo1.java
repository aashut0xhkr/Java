package com.streamapi.ashu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo1 {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(12,23,95,17,21);
        al.stream().filter(i->i>10).forEach(i-> System.out.println(i));


    }
}
