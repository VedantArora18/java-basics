package arrays;
import java.util.*;

public class kadanesalgo{  
    public static void kadanes(int numbers[]){
        int cs=0;
        int maxsum=0;
        for(int i=0; i<numbers.length; i++ ){
            cs = cs+ numbers[i];
            if (cs<0){
                cs=0;
            }
            maxsum=Math.max(maxsum,cs);
        }
        System.out.println("The maximum sum is "+ maxsum);
    }
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
        kadanes(list);
    }

}