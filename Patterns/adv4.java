import java.uttil.*;


public class adv4{
    public static void main(String args[]){
        
        int h=5;
        
        for (int i=1; i<=h; i++){
            for(int j=5; j>=1; j--){
                if(j>h-i){
                System.out.print(" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            
            System.out.println(" ");
        }
        
    }
}