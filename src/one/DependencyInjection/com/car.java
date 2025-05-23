package one.DependencyInjection.com;

public class car {
    private IEngine eng;
    //Constructur Injection
    public car(IEngine eng){
        this.eng=eng;
    }
    //Setter Injection
//    public void setEng(IEngine eng){
//        this.eng=eng;
//    }
 public void drive() {
     int start=eng.start();
     if(start>=1){
         System.out.println("Journey Started......");
     }
     else{
         System.out.println("Engine in trouble....");
     }
 }
}
