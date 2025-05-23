package AshokIt.exception;
import java.io.FileReader;
import java.util.*;

public class ExceptionHandle  {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("ABC.txt");
        System.out.println(fr);

    }
}
