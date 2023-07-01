package recursion;
import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.print(fib(n));
    }
    public static int fib(int n){
        
        if (n==0|| n==1){
            return n;
        }else{
            int fb=fib(n-1)+fib(n-2);
            return fb;
        }
    }
}
