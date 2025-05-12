package Functions;
public class BinaryToDecimal {
    public static void BtoD(int bin_num){
        int mynum=bin_num;
        int pow=0;
        int DecimalNum=0;
        while(bin_num>0){
            int lastdigit=bin_num%10;
            DecimalNum=DecimalNum+(lastdigit*(int)(Math.pow(2,pow)));
            pow++;
            bin_num=bin_num/10;
        }
        System.out.println("The decimal value of "+mynum+" = "+DecimalNum);
    }

    public static void main(String[] args) {
            BtoD(111);
    }
}
