package misc;

import java.io.*;

public class fileHandeling {
    public static void main(String[] args) throws IOException {
        File f=new File("abc.txt");
        f.createNewFile();
        File f1=new File("ashu");
        f1.mkdir();
}
}
