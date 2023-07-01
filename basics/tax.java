package basics;
import java.util.*;
public class tax {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your annual income: ");
        int inc= sc.nextInt();
        if(inc<=500000){
            System.out.println("You don't have to pay tax.");
            System.out.println("Your net income is :");
            System.out.println(inc);

        }else if(inc>500000 && inc<=1000000){
            System.out.println("20% tax is applicable to your income");
            System.out.println("Your Net income is: ");
            System.out.println(inc-(int)(0.2*inc));
            
        }else{
            System.out.println("30% tax is applicable to your income");
            System.out.println("Your Net income is: ");
            System.out.println(inc-(0.3*inc));
            
        }

        
        sc.close();

    }   
}
