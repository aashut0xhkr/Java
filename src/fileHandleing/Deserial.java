package fileHandleing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserial implements Serializable {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        ois.close();
        fis.close();
    }
}
