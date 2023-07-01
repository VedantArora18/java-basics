package patterns;
import java.util.*;
public class numsq {
    public static void main(String args[]){
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int n= sc.nextInt();
        while(i<=n){
        
            int j=n;
            while(j<=n){
                if(j==0){
                    break;
                }
                System.out.print(j +" ");
                j=j-1;
            }System.out.println();
            i+=1;
        }
    }
}
