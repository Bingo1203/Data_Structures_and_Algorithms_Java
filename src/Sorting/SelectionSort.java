package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void Selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int min_pos=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min_pos]>arr[j]){
                    min_pos=j;
                }
            }
            int temp=arr[min_pos];
            arr[min_pos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4,6,5};
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        Selection(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}