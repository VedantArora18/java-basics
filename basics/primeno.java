package basics;
import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
public class primeno {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a number to check whether it is prime or not:");
        int n= sc.nextInt();
        System.out.println();
        int c=0;
        for(int i=2; i<=7; i++){
            if(n==i){
                continue;
            }else if(n%i==0){
                c++;
            }
        }
        if(c==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Composite Number");
        }
    }
    
}
