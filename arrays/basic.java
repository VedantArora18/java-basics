package arrays;
import java.util.*;
public class basic {
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        callarr(arr);
    }
    public static void callarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
