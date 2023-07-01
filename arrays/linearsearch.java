package arrays;
import java.util.*;
public class linearsearch {
    public static void main(String args[]){
        int arr1[]={3, 2, 9, 4, 6, 8 };
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter element to find:");
        int a= sc.nextInt();
        for( int i=0; i<arr1.length; i++){
            if(arr1[i]!= a){
                continue;
            }else{
                System.out.print("The postion of the element is:");
                System.out.println(i+1);
            }
        }
    }
}
