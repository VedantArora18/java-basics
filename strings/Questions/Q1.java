package strings.Questions;
import java.util.*;
import java.lang.*;
public class Q1 {
    //To count lowercase vowels in a string
    public static int lowervowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch!=Character.toUpperCase(str.charAt(i)) && ch=='a'
                || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                System.out.print(ch+ " ");
                count++;
            }
        }System.out.println();
        return count;
    }
    public static void main(String args[]){
        String str="VedantArora";
        String str1="VedantArora";
        System.out.println(lowervowel(str));
        System.out.println(str.equals(str1));
    }
}
