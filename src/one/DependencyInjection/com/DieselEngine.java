package one.DependencyInjection.com;

public class DieselEngine implements IEngine{
    @Override
    public int start(){
        System.out.println("DieselEngine Started...");
        return 2;
    }
}
