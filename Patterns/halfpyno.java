import java.util.*;
public class halfpyno{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height of half pyramid *' ");
        int h=sc.nextInt(); 
        
         for (int i=1; i<=h; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
         
            }
            System.out.println();

        }


            

    }
}