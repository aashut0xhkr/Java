package fileHandleing;

import java.io.File;
import java.io.IOException;

public class showFiles {
    public static void main(String[] args) throws IOException {
        File f=new File("src");
        String[] arr=f.list();
        for(String name:arr){
            if(f.isFile()){
                System.out.println("file :" + name);
            }
            else if(f.isDirectory()){
                System.out.println("Directory : " + name);
            }
        }

    }
}
