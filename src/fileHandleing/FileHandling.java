package fileHandleing;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("ashu.txt");
        fileWriter.write("97");
        fileWriter.write("ashutosh");
        fileWriter.close();
        FileReader fr=new FileReader("ashu.txt");
        BufferedReader br=new BufferedReader(fr);
        String s = br.readLine();
        System.out.println(s);


    }
}
