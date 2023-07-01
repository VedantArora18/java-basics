package bitmanp;
import java.util.*;
public class power2 {
    public static void check(int n){
        if((n & (n-1)) == 0){
            System.out.println("power of 2");
        }else{
            System.out.println("not power of 2");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        check(n);
    }

}
