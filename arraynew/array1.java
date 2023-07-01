package arraynew;
import java.util.*;
public class array1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks[]= new int[5];
        for(int i=0; i<4; i++){
            marks[i]= sc.nextInt();
        }
        System.out.print('[');
        for(int i=0; i<4; i++){
            System.out.print(marks[i]+ ",");
        }System.out.println(']');
        System.out.println("length of array marks"+ marks.length);
    }
}
