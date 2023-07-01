import java.util.*;
public class flyodtri{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height of flyod triangle: ");
        int h=sc.nextInt();
        int number=1; 
        
         for (int i=1; i<=h; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();

        }


            

    }
}