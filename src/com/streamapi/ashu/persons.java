package com.streamapi.ashu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class persons {
    String name;
    String Country;
    persons(String name,String Country){
        this.name=name;
        this.Country=Country;
    }
    public static void main(String[] args) {
        persons p1=new persons("Ashu","India");
        persons p2=new persons("Smith","Australia");
        persons p3=new persons("Ching","China");
        persons p4=new persons("Joe","England");
        persons p5=new persons("Kumar","India");

        List<persons> list = Arrays.asList(p1, p2, p3, p4, p5);
        Stream<persons> india = (Stream<persons>) list.stream()
                                    .filter(p->p.Country.equals("India"))
                                    .map(q->q.name)
                                     .collect(Collectors.toList());





    }
}
