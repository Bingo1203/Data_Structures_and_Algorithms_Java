package Arrays2;
import java.util.*;
public class Questions {
    public static boolean Q1(int arr1[]){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i]==arr1[j]){
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int arr1[]={1,2,3,1};
        boolean ans1=Q1(arr1);
        System.out.println(ans1);
    }
}