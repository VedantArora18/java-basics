package arrays;
import java.util.*;
public class largest {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n= sc.nextInt();
        int list[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element number " + (i+1));
            int a=sc.nextInt();
            list[i]=a;
        }
        int largest=0;
        for(int i=0; i<n; i++){
            if(largest<=list[i]){
                largest=list[i];
            }else{
                continue;
            }
            
        }
        System.out.println("The largest element in the given array is: " 
            + largest);

    }
    
}
