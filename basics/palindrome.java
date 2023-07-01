package basics;
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find palindrome:");
        int n= sc.nextInt();
        int temp=n;
        int rev=0;
        while(true){

            int a= (n%10);
            rev=(rev*10)+a;
            if(n/10==0){
                break;
            }
            n=n/10;
            
        }
        System.out.println(rev);
        
        if(rev==temp){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");

        }
    }

}
