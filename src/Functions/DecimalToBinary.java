package Functions;
public class DecimalToBinary {
    public static void DtoB(int Dnum){
        int pow=0;
        int bin_num=0;
        int mynum=Dnum;
        while(Dnum>0){
            int rem=Dnum%2;
            bin_num=bin_num + (rem*(int)Math.pow(10,pow));
            Dnum=Dnum/2;
            pow++;
        }
        System.out.println("The binary number of "+mynum+" is: "+bin_num);

    }

    public static void main(String[] args) {
        DtoB(12);
    }
}