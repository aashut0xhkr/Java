package com.streamapi.ashu;

import java.util.stream.Stream;

public class Employyee {
    String name;
    int age;
    int Salary;
    Employyee(String name,int age,int Salary){
        this.name=name;
        this.age=age;
        this.Salary=Salary;
    }

    public static void main(String[] args) {
        Employyee e1=new Employyee("Ashu",35,200000);
        Employyee e2=new Employyee("Harsh",24,50000);
        Employyee e3=new Employyee("Anukul",27,20000);
        Employyee e4=new Employyee("Jhon",32,180000);
        Employyee e5=new Employyee("Ashok",29,240000);

        Stream<Employyee> stream=Stream.of(e1,e2,e3,e4,e5);
        stream.filter(i->i.Salary>50000)
                .map(i->i.name + i.age)
                .forEach(emp-> System.out.println(emp));

    }
}
