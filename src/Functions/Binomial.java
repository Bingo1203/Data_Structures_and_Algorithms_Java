package Functions;
import java.util.*;
public class Binomial {
    public static int fact(int a){
        int fact=1;
        for (int i = 1; i <= a; i++) {
            fact*=i;
        }

        return fact;
    }

    public static int Bin(int n,int r){
        int factn=fact(n);
        int factr=fact(r);
        int a=n-r;
        int sfact=fact(a);
        int binomial=factn/(factr*sfact);
        return binomial;
    }

    public static void main(String[] args) {
        int bin=Bin(7,4);
        System.out.print(bin);
    }
}