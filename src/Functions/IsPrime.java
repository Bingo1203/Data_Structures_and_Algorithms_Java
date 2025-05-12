package Functions;
import java.util.*;
public class IsPrime {
    public static boolean Prime(int a){
        boolean isPrime=true;
        if(a==2){
            isPrime=true;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                isPrime=false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(Prime(79));
    }
}