package strings;
import java.util.*;
import java.lang.*;
public class compress {
    public static StringBuilder comp(String str){
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count=0;
            char ch= str.charAt(i);
            count++;
            
            while(i<str.length()-1 && str.charAt(i+1)==ch){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
            
        }
        return sb;
        
    }
    public static void main(String args[]){
        String str="aaaabbbccd";
        String str1="abcdef";
        System.out.println(str);
        System.out.println(comp(str));
        System.out.println(str1);
        System.out.println(comp(str1));
    }
}