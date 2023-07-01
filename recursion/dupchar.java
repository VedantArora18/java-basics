package recursion;
import java.util.*;
public class dupchar {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String with multiple same characters");
        String str= sc.nextLine();

        dupchar(str,0,new StringBuilder(""),new boolean [26]);
    }
    public static void dupchar(String str, int idx, StringBuilder newstr,boolean map[]){
            if(idx== str.length()){
                System.out.println(newstr);
                return;
            }
            char currchar= str.charAt(idx);
            if(map[currchar-'a']==true){
                dupchar(str, idx+1, newstr,map);
            }else{
                map[currchar-'a']=true;
                dupchar(str, idx+1, newstr.append(currchar),map);
            }
    }
}
