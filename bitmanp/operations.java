package bitmanp;
import java.util.*;
public class operations {
    public static void iget(int n, int i){
        int a= 1<<i;
        int b= n & a;
        System.out.println(b);
        if(b==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void iset(int n, int i){
        int a= 1<<i;
        int b= n | a;
        System.out.println(b);
        
    }
    public static void iclear(int n, int i){
        int a= ~(1<<i);
        int b= n & a;
        System.out.println(b);
        
    }
    public static void ixclear(int n, int i){
        int a= ((~0)<<i);
        int b= n & a;
        System.out.println(b);
    }
    public static void clearrange(int n, int j, int i){
        int a= ((~0)<< j+1);
        int b= (1<<i)-1;
        int bitmask= a|b;
        int r= n & bitmask;
        System.out.println(r);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.println("Enter a ith position");
        int i= sc.nextInt();
        iget(n,i);
        iset(n,i);
        iclear(n,i);
        ixclear(n,i);
        System.out.println("Enter a jth position");
        int j= sc.nextInt();
        clearrange(n, j, i);

    }

}
