package AshokIt.exception;

public class userDefinedException2 {
    private String getName(int id){
        if(id==100){
            return "Raju";
        }
        else if (id==101){
            return "Rani";
        }
        else{
            throw new userDefinedException("Invalid ID");
        }
    }
    public static void main(String[] args) {
        userDefinedException2 U=new userDefinedException2();
        U.getName(200);
    }
}
