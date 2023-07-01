package recursion;
import java.util.*;
public class tiling {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of floor");
        int n= sc.nextInt();
        System.out.println(tile(n));
    }
    public static int tile(int n){
        if(n==0||n==1){
            return 1;
        }
        int vertical= tile(n-1);
        int horizontal= tile(n-2);
        int total= vertical+horizontal;
        return total;
    }
}
