package AshokIt.exception;

import java.io.*;

public class Person implements Serializable {
    int a=10;
    String name="RAJU";

    public static void main(String[] args) throws Exception{
        Person p=new Person();
        FileOutputStream fos=new FileOutputStream("Person.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.close();

        FileInputStream fis=new FileInputStream("Person.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object o = ois.readObject();
        Person o1 = (Person) o;
        System.out.println(o1.name);
        System.out.println(o1.a);
        ois.close();

    }
}
