package com.streamapi.ashu;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Mapping {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("usa","japan","india","uk");
        name.stream().map(names-> names.toUpperCase()).forEach(i-> System.out.println(i));
    }
}
