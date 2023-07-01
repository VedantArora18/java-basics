package bitmanp;
import java.util.*;
public class setbit{
    public static void check(int n){
        int count=0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n=n>>1;
        } 
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        check(n);
    }

}