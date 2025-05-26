package MethodAndConstRef;

public class MethodRef {
    public static void main(String[] args) {
        Workinter wi=Stuff::dostuff;
        wi.dotask();
    }
}
