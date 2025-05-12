package Arrays1;
import java.util.*;
public class LargestNumber {
    public static int Largest(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
        return max;
    }

    public static void main(String[] args) {
        int arr[]={12,43,54,32,123,322,678};
        int max=Largest(arr);
        System.out.println("Largest value is: "+max);
    }
}