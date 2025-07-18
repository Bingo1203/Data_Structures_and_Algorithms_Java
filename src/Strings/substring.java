package Strings;
import java.util.*;
public class substring {
    public static void substring(String str,int si,int ei){
        String string="";
        for (int i = si; i <= ei; i++) {
            string+=str.charAt(i);
        }
        System.out.println(string);
    }
    public static void main(String[] args) {
        String str="Hello World";
        substring(str,1,7);
    }
}