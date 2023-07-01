package strings;
import java.util.*;
import java.lang.*;
public class shortestpath{
    public static float nshort(String str){
        int y=0;
        int x=0;
        int n= str.length();
        for (int i=0; i<n; i++){
            char char1= str.charAt(i);
            if(char1=='N'|| char1=='n'){
                y++;
            }else if(char1=='S'|| char1=='s'){
                y--;
            }else if(char1=='W'|| char1=='w'){
                x--;
            }
            else if(char1=='E'|| char1=='e'){
                x++;
            }
        }
        System.out.println("The shortest path is ");
        float sp=0;

        int x2= x*x;
        int y2= y*y;
        int val=x2+y2;
        sp=(float)(Math.sqrt(val));
        return sp;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter direction in single string:");
        String str= sc.next();
        System.out.print(nshort(str));
    }
}