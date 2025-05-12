package Functions;
import java.util.*;
public class Factorial{
    public static int fact(int a){
        int fact=1;
        for (int i = 1; i <= a; i++) {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int fact=fact(10);
        System.out.println(fact);
    }
}