package leetcode;
import java.util.*;
public class palindrome {
    
    public static boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(true){
            int a=n%10;
            rev=rev*10+a;
            if(n/10==0){
                break;
            }
            
            n=n/10;
        }
        if(rev==x){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        System.out.println(isPalindrome(b));
    }
}
