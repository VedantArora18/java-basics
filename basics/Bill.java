package basics;
import java.util.*;
public class Bill{
    public static void main (String args[]) {
        System.out.println("***  Welcome to Walmart  ***");
        System.out.println("Enter the Item Number you want to buy:");
        System.out.println("1. Pencil= $2");
        System.out.println("2. Pen= $5");
        System.out.println("3. Paper= $4");
        System.out.println("4. NoteBook= $10");
        System.out.println("** Additional 18% gst is applicable");
        Scanner sc= new Scanner(System.in);
        
        
        int a= sc.nextInt();
        if(a==1){
            float plc= (2 + (2* (18f/100))); 
            System.out.println("Total price=" + plc) ;
        }else if(a==2){
            float pc= (5 + (5* (18f/100))); 
            System.out.println("Total price=" + pc) ;
        }else if(a==3){
            float ppc= (4 + (4* (18f/100))); 
            System.out.println("Total price=" + ppc) ;
        }else if(a==4){
            float nbc= (10 + (10* (18f/100f))); 
            System.out.println("Total price=" + nbc) ;
        }else{
            
            System.out.println("Please enter a correct choice.") ;
        }

        sc.close();   

    }
}