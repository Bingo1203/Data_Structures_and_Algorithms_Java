package Recursion;
import java.net.StandardSocketOptions;
import java.util.*;

public class Decreasing {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }

        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDec(n);
    }
}