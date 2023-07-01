import java.util.*;
public class adv2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        
        int h=5;
        int s=2*h;
        
        
        
        for (int i=1; i<=5;i++){
            for (int j=1; j<=10; j++){
                int sum=i+j;
                if (sum>=6 & sum<11) {
                    if (i==1 || j==1 || i==5|| j==10){
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");

                }
           }    
           System.out.println("");
        }
        
        


            

    }
}