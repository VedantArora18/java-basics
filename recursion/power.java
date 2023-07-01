package recursion;
import java.util.*;
public class power{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter power: ");
        int n = sc.nextInt();
        
        System.out.print(pow(x,n));
    }
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }else{
            return x * pow(x, n-1);
        }
    }
}