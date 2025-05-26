package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aList {
    public static void main(String[] args) {
        List a=new ArrayList();
        ArrayList b=new ArrayList();
        a.add(100);
        a.add("Ashu");
        a.add(null);

        System.out.println(a.toString());
        for (int i = 0; i <a.size() ; i++) {
            System.out.println(a.get(i));

        }





    }
}
