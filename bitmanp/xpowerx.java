package bitmanp;
import java.util.*;
public class xpowerx{
    public static void check(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans =ans* a;
            }
            a=a*a;
            n=(n>>1);
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int a= n;
        check(a,n);
    }

}