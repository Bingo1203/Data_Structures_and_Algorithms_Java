package Arrays2;
import java.util.*;
public class MaxSubArraySum3 {
    public static void Sum(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }

        System.out.println("The maximum sum of the array is: "+ms);
    }

    public static void main(String[] args) {
        int arr[]={-12,34,56,-78,65,32};
        Sum(arr);
    }
}