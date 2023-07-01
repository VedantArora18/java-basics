package patterns;
import java.util.*;
public class floyd {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height of pyramid:");
        int n= sc.nextInt();
        int num=0;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                num+=1;
                System.out.print(num+" ");
            }System.out.println();
        }
    }
}