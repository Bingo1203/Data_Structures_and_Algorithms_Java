package Functions;
import java.util.*;
public class IsEven {
    public static boolean IsEven(int num){
        if(num%2==0){
            return true;
        }

        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean b=IsEven(num);
        System.out.println(b);
    }
}