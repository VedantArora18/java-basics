import java.util.*;
public class tritri{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height of 0-1 triangle: ");
        int h=sc.nextInt();
         for (int i=1; i<=h; i++){
            for (int j=1; j<=i; j++){
                int sum=i+j;
                if (sum%2==0) {
                    System.out.println("1");
                } else{
                    System.out.println("0");
                }
                
            }
           

        }


            

    }
}