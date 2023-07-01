package arrays;
import java.util.*;

public class prefixsum {  
    public static void main(String args[]){
        int ts=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:" );
        int n= sc.nextInt();
        int list[]= new int[n];
        int prefix[]= new int[list.length];
        int maxsum=0;
    
        for(int i=0; i<n; i++){
            System.out.println("Enter the element number "+ (i+1)); 
            int a = sc.nextInt();
            list[i]= a;
        }
        System.out.println("The list is:");
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" "); 
            
        }System.out.println();
        prefix[0]=list[0];        

        System.out.print(prefix[0]+" ");
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+list[i];
            System.out.print(prefix[i]+" ");
            
        }System.out.println();
        for(int i=0; i<n; i++){
            
            for(int j=i; j<n; j++){
                int sum=0;
                
                int currsum=i==0? prefix[0]: prefix[j]+prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                
            }System.out.println();

        }
        
        System.out.println("Total number of sub arrays=" + ts);
        System.out.println("The max sum is :"+ maxsum);
        
    }

}