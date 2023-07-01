package recursion;
import java.util.*;
public class incdecnumb {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int a=n;
        System.out.println();
        dec(n);
        System.out.println();
        inc(n);
    }
    public static void dec(int n){
        System.out.print(n+ " ");
        n=n-1;
        if(n==0){
            System.out.println(" ");
        }else{    
            dec(n);
        }
    }
    public static void inc(int n){
        if(n==1){
            System.out.print(n+" ");
        }else{
            inc(n-1);
            System.out.print(n+" ");
        }
    }
}
