//Sort an array

package CoreJava;
import java.util.*;

public class Class23 {
    public static void main(String[] args) {
        int [] arr={34,32,14,16,5};
        int temp=0;
        //First way
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       // Second way
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
