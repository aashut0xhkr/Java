package AshokIt.exception;

public class exceptionFinally {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        catch (Exception e) {
//        e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
