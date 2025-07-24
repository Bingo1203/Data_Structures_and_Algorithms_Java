package Bit_Manipulation;
import java.util.*;
public class OddOrEven {
    public static void OddorEven(int n){
        if((n&1)==1){
            System.out.println("Odd Number");
        }

        else{
            System.out.println("Even Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OddorEven(n);
    }
}