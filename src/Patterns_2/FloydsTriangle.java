package Patterns_2;
import java.util.*;
public class FloydsTriangle {
    public static void floyd(int n){
        int counter=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        floyd(n);
    }
}