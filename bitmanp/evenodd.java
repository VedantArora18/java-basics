package bitmanp;
import java.util.*;
public class evenodd {
    public static void check(int n){
        if((n & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        check(n);
    }

}
