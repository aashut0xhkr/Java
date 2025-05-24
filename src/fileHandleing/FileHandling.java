package fileHandleing;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("ashu.txt");
        BufferedWriter br=new BufferedWriter(fileWriter);
        br.write("Java is best");
        br.close();

        FileReader fr=new FileReader("ashu.txt");
        BufferedReader bq=new BufferedReader(fr);
        String s = bq.readLine();
        System.out.println(s);


    }
}
