package Functions;
import java.util.*;
public class AverageThreeNum {
    public static void avg(int num1,int num2,int num3){
        int avg=(num1+num2+num3)/3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        avg(num1,num2,num3);
    }
}