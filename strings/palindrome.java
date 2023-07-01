package strings;
import java.util.*;
import java.lang.*;
public class palindrome {
    public static boolean palin(String str){
        
        int n =str.length();
        for(int i=n-1; i>=0; i--){
            char char1 =str.charAt(i);
            System.out.print((char1));
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1= sc.next();
        palin(str1);
    }
}