package Arrays1;
import java.util.*;
public class Reverse {
    public static int[] Reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={5,4,32,6,87,23};
        int arr1[]=Reverse(arr);
        System.out.println(Arrays.toString(arr1));
    }
}