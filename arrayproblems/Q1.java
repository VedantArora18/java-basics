package arrayproblems;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Q1 {
    public static boolean check(int num[]){
        int counter=0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    counter++;
                    
                }
                
            }
        }if(counter>0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number of elements in array:");
        int n= sc.nextInt();
        int list[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element number " + (i+1));
            int a=sc.nextInt();
            list[i]=a;
        }
        for(int i=0; i<n; i++){
            System.out.print(list[i]+" ");
        }System.out.println();
        System.out.println(check(list));
    }
}
