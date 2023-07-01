package basics;
import java.util.*;
public class no10 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("Enter numbers but not multiple of 10:");
        System.out.println();
        while(true){
            System.out.println("Enter a new number:");
            int n= sc.nextInt();
            if(n%10==0){
                System.out.println("You just entered a multiple of 10");

                break;
            }else{
                System.out.println(n);
            }
        }
    }
    
}
