package fileHandleing;
import java.io.*;
public class FileCreation {

    public static void main(String[] args) throws IOException{
        File f1=new File("Ashu");
        f1.mkdir();
        File f=new File("AShu","devil.txt");
        f.createNewFile();
    }
}
