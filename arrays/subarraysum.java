package arrays;
import java.util.*;

public class subarraysum {  
    public static void main(String args[]){
        int ts=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:" );
        int n= sc.nextInt();
        int list[]= new int[n];
        int maxsum=0;
        int minsum=0;
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
                int sum=0;
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(list[k]+ " ");
                    sum+=list[k];
                    
                }System.out.print("] "); 
                System.out.print("sum="+sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
                if(minsum>sum){
                    minsum=sum;
                }
                ts++;
                System.out.println();
                
                
            }System.out.println();

        }
        
        System.out.println("Total number of sub arrays=" + ts);
        System.out.println("The max sum is :"+ maxsum);
        System.out.println("The min sum is :"+ minsum);
    }

}
