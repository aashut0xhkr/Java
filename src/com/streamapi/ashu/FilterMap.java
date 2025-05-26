package com.streamapi.ashu;

import java.util.Arrays;
import java.util.List;

public class FilterMap {
    public static void main(String[] args) {
        List<String> li= Arrays.asList("Ashok","Anil","Raju","Rani","Jhon","Akash","Charles");
        li.stream().filter(i->i.charAt(0)=='A')
                .map(i->i+" "+ i.length()).forEach(n-> System.out.println(n));

    }
}
