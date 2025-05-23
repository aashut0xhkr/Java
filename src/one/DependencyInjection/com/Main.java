package one.DependencyInjection.com;

public class Main {
    public static void main(String[] args) {
        car car=new car(new DieselEngine());
        car car1=new car(new PetrolEngine());
//        car.setEng(new PetrolEngine());
        //Setter will override above
        //eager loading & lazy loading in mapping
        //eager initialisation & lazy initialisation
        car.drive();
        car1.drive();
    }
}
