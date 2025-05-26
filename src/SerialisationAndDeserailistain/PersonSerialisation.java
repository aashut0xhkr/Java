package SerialisationAndDeserailistain;

import java.io.*;

public class PersonSerialisation implements Serializable {
    int id;
    String name;

    public static void main(String[] args) throws Exception {
        PersonSerialisation p=new PersonSerialisation();
        p.id=100;
        p.name="RAju";
        FileOutputStream fos=new FileOutputStream("PersonSerialisation.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.flush();
        oos.close();

        FileInputStream fis=new FileInputStream("PersonSerialisation.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object o = ois.readObject();
        PersonSerialisation p1=(PersonSerialisation)o;
        System.out.println(p1.id);
        System.out.println(p1.name);
        ois.close();
    }
}
