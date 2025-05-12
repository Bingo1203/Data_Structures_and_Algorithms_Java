package Functions;
import java.util.*;
public class SumOfDigits {
    public static int Sum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=Sum(num);
        System.out.println("The sum of digits in the number "+num+" is: "+a);
    }
}