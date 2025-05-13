package Sorting;
import java.util.*;
public class BubbleSort {
    public static void Bubble(int arr[]){
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4,6,5};
        Bubble(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}