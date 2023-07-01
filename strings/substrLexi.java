package strings;
import java.util.*;
import java.lang.*;
public class substrLexi {
    public static String substr(String str, int s, int e){
        
        String str1="";
        for(int i=s; i<e; i++){
            
            str1+=str.charAt(i);;
        }
        
        return str1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1= sc.nextLine();
        System.out.print("Enter start: " );
        int s=sc.nextInt();
        System.out.print("Enter end: " );
        int e=sc.nextInt();
        System.out.println(substr(str1,s,e));
        //System.out.println(str1.substring(13,18));
        String array[]={"apple","banana", "mango" };
        String largest=array[0];
        for(int i=0; i<array.length; i++){
            if(largest.compareTo(array[i])<0){
                largest=array[i];
            }
        }
        System.out.println(largest);
    }
}