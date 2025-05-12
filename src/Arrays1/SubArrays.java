package Arrays1;
import java.util.*;
public class SubArrays {
    public static void Subarrays(int arr[]){
        int ts=0;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                for (int k = start; k < end; k++) {
                    System.out.print(arr[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are: "+ts);
    }

    public static void main(String[] args) {
        int arr[]={12,34,21,23,1233,223,234,930};
        Subarrays(arr);
    }
}