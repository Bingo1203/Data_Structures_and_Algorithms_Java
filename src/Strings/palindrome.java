package Strings;
import java.util.*;
public class palindrome {
    public static boolean isPalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            if (word.charAt(i)!=word.charAt(word.length()-i-1)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        boolean palindrome=isPalindrome(word);
        System.out.println(palindrome);
    }
}