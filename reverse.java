package arrays;
import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:" );
        int n= sc.nextInt();
        int list[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element number "+ (i+1)); 
            int a = sc.nextInt();
            list[i]= a;
        }
        System.out.println("The reverse list is:");
        for(int i=n-1; i>=0; i--){
            System.out.print(list[i]+" "); 
            
        }
        
    }
}
