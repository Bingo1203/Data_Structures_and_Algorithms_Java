package Looping;
import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean IsPrime=true;
        if(n==2){
            System.out.println(IsPrime);
        }

        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    IsPrime=false;
                }
            }
        }

        if(IsPrime==true){
            System.out.println("The number is prime");
        }

        else{
            System.out.println("Number is not a prime number");
        }
    }
}