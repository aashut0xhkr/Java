package java8.com;
import java.util.Scanner;
import java.util.function.Predicate;
public class PredicateDem {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int i=sc.nextInt();
//        Predicate<Integer> p=j->j>10;
//        System.out.println(p.test(i));
        String[] name={"Ashu","Harsh","Ankur","Anushka"};
        Predicate<String> p= naam->naam.charAt(0)=='A';
        for(String names:name){
            if(p.test(names)){
                System.out.println(names);
            }
        }



    }
}
