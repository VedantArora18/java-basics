import java.util.*;
public class adv1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int h=sc.nextInt();
        int s=2*h;
        for (int i=1; i<=h; i++){
            for (int j=1; j<=s; j++){
                if(j<=i || j>s-i ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }   
            }
            System.out.println();
        }
        for (int i=h; i>=1; i--){
            for (int j=1; j<=s; j++){
                if(j<=i || j>s-i ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }   
            }
            System.out.println();
        }
        


            

    }
}