package Conditional_Statements;
import java.util.*;
public class Q1{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int a=sc.nextInt();
            if(a<0){
                System.out.println(a+" is negative");
            } else{
                System.out.println(a+" is positive");
            }
    }
}