package sorting;
import java.util.*;
public class selection {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements for array:");
        int n= sc.nextInt();
        int list[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter element:");
            int a= sc.nextInt();
            list[i]=a;
        }
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" ");
        }System.out.println();
        
        for(int i=0; i<n-1; i++){
            int min= i; 
            for( int j=i+1; j<n; j++){
                if(list[j]<list[min]){
                    min=j;
                }
                
            }int temp= list[min];
            list[min]= list[i];
            list[i]= temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" ");
        }System.out.println();
    }
}
