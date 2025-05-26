package fileHandleing;
import java.io.*;
import java.util.*;
public class practice {
    public static void main(String[] args)  throws IOException{
//        File f=new File("Ashu.txt");
//        f.createNewFile();
//        File f1 =new File("AShu");
//        f.mkdir();
//        File f2=new File("E:\\PSA");
//        f2.createNewFile();
//        f2.delete()

//        String [] arr= f2.list();

//        for(String name:arr){
//            if(f2.isFile()){
//            System.out.println("File : "+ name);
//        } else if (f2.isDirectory()) {
//                System.out.println("Directory : "+ name);
//            }


        FileWriter fw=new FileWriter("Data.txt");
        fw.write("hii ,how are you ");
        fw.flush();
        fw.close();
;        }

}
