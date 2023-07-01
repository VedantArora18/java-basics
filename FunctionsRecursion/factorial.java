package FunctionsRecursion;
import java.util.*;
public class factorial {
    public static int fact(int a){
        if (a==1){
            return 1;
        }else{
            int f= a * fact(a-1); 
            return f;
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial:");
        int n= sc.nextInt();
        int s=fact(n);
        System.out.println("The Factorial of the number is:"+ s);
    }
}
