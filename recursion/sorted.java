package recursion;
import java.util.*;
public class sorted{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]= {1,2,3,5,4};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }System.out.println();
        System.out.println("Enter a number: ");
        int i = sc.nextInt();
        
        System.out.print(check(arr, i));
    }
    public static boolean check(int arr[], int i){
        if(i==arr.length-1){
        return true;
        }
        if(arr[i]>arr[i+1]){
            System.out.println(arr[i]+">" +arr[i+1]);
            return false;
        }else{
            return check(arr, i+1);
        }
        
    }
}