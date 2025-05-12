package Arrays1;
import java.util.*;
public class BinarySearch {
    public static int Binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={12,34,56,78,90,68,31,54};
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int num=Binary(arr,key);
        System.out.println("The key is found at "+num+" index");
    }
}