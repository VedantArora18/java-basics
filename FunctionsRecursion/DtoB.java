package FunctionsRecursion;
import java.util.*;
public class DtoB {
    public static int decitobin(int a){
        int c=0;
        int bin=0;
        while(true){
            int n= a%2;
            bin= bin+ (n* (int)Math.pow(10, c));
            c++;
            if(a/2==0){
                break;
            }
            a=a/2;
        }
        return bin;
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number:");
        int deci= sc.nextInt();
        System.out.println(decitobin(deci)); 
    }
    
}

