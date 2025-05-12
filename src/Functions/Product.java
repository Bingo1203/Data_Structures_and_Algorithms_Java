package Functions;
public class Product{
    public static int product(int a,int b){
        int prod=a*b;
        return prod;
    }

    public static void main(String[] args) {
        System.out.println("Product of two digits is given by:");
        int prod=product(23,78);
        System.out.println(prod);
    }
}