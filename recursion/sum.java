package recursion;
import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }else{
            sum(n-1);
            return n+sum(n-1);
        }
    }
}
