package basics;
import java.util.*;
public class sumf {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to find sum of factors:");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                sum+=i;
            }
        
        }
        System.out.println("The sum of factors is: ");
        System.out.println(sum);
    }
}
