package patterns;
import java.util.*;
public class fullpy {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);    
        System.out.println("Enter the height of the half pyramid:");
        int n= sc.nextInt();
        for ( int i=n; i>1; i--){
            for(int j=n-i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

