package FunctionsRecursion;
import java.util.*;
import java.lang.Math;
public class BtoD {
    public static int bintodeci(int a){
        int c=0;
        int dec=0;
        while(true){
            int n= a%10;
            dec= dec+ (n* (int)Math.pow(2, c));
            c++;
            if(a/10==0){
                break;
            }
            a=a/10;
        }
        return dec;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number:");
        int bin= sc.nextInt();
        System.out.println(bintodeci(bin)); 
    }
}
