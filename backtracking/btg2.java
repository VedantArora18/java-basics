package backtracking;
import java.util.*;
public class btg2 {
    public static void subset(String str, String ans, int i){
        if(i==str.length()){ 
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            
            }
            return;
        }
        //yes
        subset(str, ans+str.charAt(i), i+1);
        //no
        subset(str, ans, i+1);
    }
    public static void main(String args[]){
        String str="abc";
        subset(str, "", 0);
    }
}
