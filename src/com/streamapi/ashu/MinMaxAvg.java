package com.streamapi.ashu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxAvg {
    public static void main(String[] args) {
        person p1=new person("Ashu",101,50000);
        person p2=new person("Kumar",102,40000);
        person p3=new person("Ashok",103,1000000);
        person p4=new person("Naresh",105,3000000);
        person p5=new person("Steve",104,100000);;

        List<person> list = Arrays.asList(p1, p2, p3, p4, p5);
        list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.Salary)));
    }
}
class person{
    String name;
    int id;
    double Salary;
    person(String name,int id,double Salary){
        this.name=name;
        this.id=id;
        this.Salary=Salary;
    }
}
