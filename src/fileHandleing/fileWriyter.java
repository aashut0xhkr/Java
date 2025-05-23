package fileHandleing;
import java.io.*;
public class fileWriyter {
    public static void main(String[] args) throws IOException{ 
        FileReader f=new FileReader("DATA.txt");
//        f.write("Hi, How are you");
//        f.write("\n");
//        f.write("what are u doing");
//        f.flush();
//
//        f.close();
//        f = new FileWriter("DATA.txt");
        f.read();

    }
}
