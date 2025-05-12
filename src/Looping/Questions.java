package Looping;
import java.util.*;
/*Q1*/
/*public class Questions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        System.out.println("Enter the number of integers you want: ");
        int n=sc.nextInt();
        int count=0;
        do{
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }

            count++;
        }while(count<n);

        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}*/


/*Q2*/
/*public class Questions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        if(n==0){
            System.out.println("Factorial is: "+factorial);
        }
        else{
            for (int i = 1; i <= n; i++) {
                factorial*=i;
            }
            System.out.println("The Factorial is: "+factorial);
        }
    }
}*/


/*Q3*/
public class Questions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<11){
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }
    }
}


