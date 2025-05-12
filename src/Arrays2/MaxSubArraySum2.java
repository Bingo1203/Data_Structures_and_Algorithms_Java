//Prefix Method: Time Complexity of O(n2)
package Arrays2;
import java.util.*;
public class MaxSubArraySum2 {
    public static void Sum(int arr[]){
        int prefix[]=new int[arr.length];
        int maxSum=Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("The maximum sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]={-12,34,56,-78,65,32};
        Sum(arr);
    }
}