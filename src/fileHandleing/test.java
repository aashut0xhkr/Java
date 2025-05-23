package fileHandleing;
import java.io.*;

public class test implements Serializable{
    /**
     *
     */
    public static final long serialVersionUID= 100L;
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("test.txt");
        f.write('c');
        f.flush();
        f.close();


    }

}
