package recursion;
import java.util.*;
public class Q1{
    public static void main(String args[]){
        int arr[]={6,3,9,8,0,2,5,-5};
        callarr(arr);
        int target=6;
        System.out.println("target=" + target);
        int tarIdx=search(arr, target, 0, arr.length-1);
        System.out.println("Index="+ tarIdx);
        
    }
    public static void callarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static int search(int arr[], int tar,int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid= si+(ei-si)/2;
        if(arr[mid]== tar){
            return mid;
        }
        // mid on L1
        if(arr[si]<= arr[mid]){
            //case 2:left
            if(arr[si]<= tar && arr[mid]>= tar){
                return search(arr, tar, si, mid);
            }else{
            //case 2:right
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //case 3:right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1,ei);
            }else{
                //case 3:left
                return search(arr, tar, si, mid-1);
            }
        }
    }

}