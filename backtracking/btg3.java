package backtracking;
import java.util.*;
public class btg3 {
    public static void permut(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length(); i++ ){
            //remove
            String NewStr=str.substring(0,i)+str.substring(i+1);
            permut(NewStr, ans+str.charAt(i));
        }
    }
    public static void main(String args[]){
        String str="abc";
        String ans="";
        permut(str,ans);
    }
}
