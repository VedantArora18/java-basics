package sorting;
import java.util.*; 
public class counting {
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
        int largest=0;
        for(int i=0; i<n; i++){
            largest= Math.max(largest, list[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0; i<n; i++){
            count[list[i]]++;
        }
        int j=0;
        for(int i=0; i<largest+1; i++){
            while(count[i]>0){
                list[j]= i;
                j++;
                count[i]--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" ");
        }
    }
}

