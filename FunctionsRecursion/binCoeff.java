package FunctionsRecursion;
import java.util.*;
public class binCoeff {
    public static int fact(int a){
        int f=1;
        for (int i=a; i>=1; i-- ){
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int bc= (fact(n) / (fact(n-r)* fact(r)));
        return bc;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r= sc.nextInt();
        System.out.println(fact(n) + " ,"+ fact(r)+ " ,"+ fact(n-r));
        System.out.println("The binomial Coefficient is: ");
        System.out.println(binCoeff(n,r));
    }
}
