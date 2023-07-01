package arrays;
import java.util.*;
public class binarysearch {
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
        System.out.println("The list is:");
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" "); 
            
        }System.out.println();
        int beg, end,mid;
        beg=0;
        end=n-1;
        mid=(n+1)/2;
        System.out.println("Enter the element you want to search:");
        int key= sc.nextInt();
        while(true){
            if(key>list[mid]){
                beg=mid;
                mid=(beg+end)/2;
            }else if(key<list[mid]){
                end=mid;
                mid=(beg+end)/2;
            }else{
                System.out.println("The position of key is= "+(mid+1));
                break;
            }
        }
    }
}
