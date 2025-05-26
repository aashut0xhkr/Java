package com.streamapi.ashu;

import java.util.Arrays;
import java.util.List;

public class ParralelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 6);
        list.stream().parallel().forEach(e-> System.out.println(e));
    }
}
