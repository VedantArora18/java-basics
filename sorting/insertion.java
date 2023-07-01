package sorting;
import java.util.*; 
public class insertion {
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
        for(int i=1; i<n; i++){
            int curr=list[i];
            int prev= i-1;
            while(prev>=0 && curr<list[prev]){
                list[prev+1]= list[prev];
                prev--;
            }
            list[prev+1]= curr;
        }
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" ");
        }
    }
}
