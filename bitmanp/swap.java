package bitmanp;
import java.util.*;
public class swap{
    public static void check(int x,int y){
        System.out.println("x="+ x+" y="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap");
        System.out.println("x="+ x+" y="+y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        check(x,y);
    }

}
