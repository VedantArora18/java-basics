import java.util.*;
public class solidrect{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter breadth and length of rectangle of '*' ");
        int a=sc.nextInt(); 
        int b =sc.nextInt(); 
         for (int i=1; i<=b;i++){
             for (int j=1; j<=a; j++){
                System.out.print("*");
            }    
            System.out.println(" ");
         }
    

            

    }
}