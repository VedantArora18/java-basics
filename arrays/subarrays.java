package arrays;
import java.util.*;
public class subarrays {
    public static void main(String args[]){
        int ts=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:" );
        int n= sc.nextInt();
        int list[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element number "+ (i+1)); 
            int a = sc.nextInt();
            list[i]= a;
        }
        System.out.println("The list is:");
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" "); 
            
        }System.out.println();
        
        for(int i=0; i<n; i++){
            
            for(int j=i; j<n; j++){
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(list[k]+ " ");
                }System.out.print("]"); 
                ts++;
                System.out.println();
                
                
            }System.out.println();

        }
        System.out.println("Total number of sub arrays=" + ts);
    }
}
