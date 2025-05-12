package Patterns_2;
import java.util.*;
public class HollowRectangle {
    public static void Rectangle(int totR,int totC) {
        for (int i = 1; i <= totR; i++) {
            for (int j = 1; j <= totC; j++) {
                if (i == 1 || i == totR || j == 1 || j == totC) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of rows: ");
            int r=sc.nextInt();
            System.out.println("Enter the no. of cols: ");
            int c=sc.nextInt();
            Rectangle(r,c);
        }
}