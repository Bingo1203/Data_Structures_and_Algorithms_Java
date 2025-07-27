package Bit_Manipulation;
import java.util.*;
public class Ith_bit {
    public static int get_ith_bit(int n, int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }

        else{
            return 1;
        }
    }

    public static int set_ith_bit(int n , int i){
        int bitmask=1<<i;
        return n|bitmask;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(get_ith_bit(n,i));
        System.out.println(set_ith_bit(n,i));

    }
}