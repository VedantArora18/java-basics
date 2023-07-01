package recursion;
import java.util.*;
public class optpower{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter power: ");
        int n = sc.nextInt();
        
        System.out.print(optpow(x,n));
    }
    public static int optpow(int x, int n){
        if(n==0){
            return 1;
        }
        int h= optpow(x, n/2);
        int h2= h*h;
        
        if(n%2!=0){
            h2= x * h2;
        }
            return h2;
        

    }
}