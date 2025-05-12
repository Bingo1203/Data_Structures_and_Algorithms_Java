//Brute Force Method: Time Complexity of O(n3)
package Arrays2;

public class MaxSubArraySum1 {
    public static void Sum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum+=arr[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }

        }
        System.out.println("Max sum is :"+ maxSum);
    }

    public static void main(String[] args) {
        int arr[]={-12,34,56,-78,65,32};
        Sum(arr);
    }
}