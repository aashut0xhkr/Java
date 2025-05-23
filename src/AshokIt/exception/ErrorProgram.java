package AshokIt.exception;

public class  ErrorProgram {
    void m1(){
        m2();
    }
    void m2(){
        m1();
    }

    public static void main(String[] args) {
        ErrorProgram e=new ErrorProgram();
        e.m1();
    }
}
