//package java8.com;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//
//class Employee {
//    String name;
//    String location;
//    String dept;
//
//    Employee(String name, String location, String dept) {
//        this.name = name;
//        this.location = location;
//        this.dept = dept;
//    }
//}
//public class PredicateJoining {
//    public void main() {
//        Employee e1=new Employee("A","HYD","DB");
//        Employee e2=new Employee("AB","NOI","DEVOPS");
//        Employee e3=new Employee("AC","BLR","DEVOPS");
//        Employee e4=new Employee("AD","HYD","DB");
//        Employee e5=new Employee("AE","BLR","BA");
//
//        List<Employee> l1= Arrays.asList(e1, e2, e3, e4, e5);
//
//        Predicate<Employee> p1=e->e.location.equals("HYD");
//        Predicate<Employee> p2=e->e.dept.equals("DB");
//
//        Predicate <Employees> p= p1.and(p2);
//        for(Employee e:emps){
//            if(p.test(e)){
//                System.out.println(e.name);
//            }
//
//        }
//    }
//}
