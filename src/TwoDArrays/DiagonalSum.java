package TwoDArrays;
import java.util.*;
public class DiagonalSum {
    public static int Sum(int matrix[][]){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int sum=Sum(matrix);
        System.out.println("Sum of primary and secondary diagonal is: "+sum);
    }

}
