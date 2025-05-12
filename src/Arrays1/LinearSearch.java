package Arrays1;
import java.util.*;
public class LinearSearch {
    public static int Linear(int arr[],int key){
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the "+(i+1)+" number: ");
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        System.out.println("Enter the number to find:");
        int key=sc.nextInt();
        int n=Linear(arr,key);
        if(n==-1){
            System.out.println("Number does not exist in the array");
        }
        else{
            System.out.println(key+" exists in the array at "+n+"th index");
        }

    }
}