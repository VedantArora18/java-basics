import java.util.*;
public class hollowrect{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter breadth and length of rectangle of '*' ");
        int a=sc.nextInt(); 
        int b =sc.nextInt(); 
         for (int i=1; i<=b;i++){
            for (int j=1; j<=a; j++){
                 if (i==1 || j==1 || i==b|| j==a){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
         }
    

            

    }
}