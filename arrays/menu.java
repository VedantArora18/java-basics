package arrays;
import java.util.*;
import java.util.*;
public class menu {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String menu[]={"Dosa", "Chole Bhature", "Samosa", "Sandwich", 
        "Chole Kulche"};
        int menuprice[]={70, 50, 10, 30, 40};
        for(int i=0; i<menu.length; i++){
            System.out.println((i+1) + "." + menu[i]);
        }
    
        System.out.println("What would you like to eat? Enter item name :");
        int a= sc.nextInt();
        System.out.println("You have selected:");
        System.out.print(menu[a-1]+ "= ");
        System.out.println("$"+ menuprice[a-1]);
        
    }

}

