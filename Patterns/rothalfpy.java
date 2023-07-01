import java.util.*;

public class rothalfpy{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height of half pyramid * ");
        int h=sc.nextInt(); 
        
         for (int i=h; i>=1; i--){
            for (int j=1; j<=h; j++){
                if (j>=i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


            

    }
}