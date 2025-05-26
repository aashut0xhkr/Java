package java8.com;
interface in{
    public void m1();
}
public class LambdaExpression{
    public static void main(String[] args) {
        in as=()-> System.out.println(100);
        as.m1();
    }
}
