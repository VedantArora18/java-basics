package sorting;
import java.util.*; 
public class bubble {
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
            int swap=0;
            for(int j=0; j<n-1-i; j++){
                
                if(list[j]>list[j+1]){
                    swap++;
                    int temp =list[j];
                    //System.out.print(temp);
                    list[j]= list[j+1];
                    //System.out.print(list[j]);
                    list[j+1]= temp;
                    //System.out.print(list[j+1]);
                }
            }if(swap==0){
                break;
            }else{
                System.out.println("Processing...");
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" ");
        }
    }
}
