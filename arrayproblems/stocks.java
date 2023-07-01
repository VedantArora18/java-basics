package arrayproblems;
import java.util.*;
public class stocks {
    public static int profit(int list[]){
        int n= list.length;
        int maxprofit= 0;
        int buyP= Integer.MAX_VALUE;
        int temp=0;
        for (int i=0; i<n; i++) {
            if(buyP<list[i]){
                int profit= list[i]-buyP;
                if(maxprofit<profit){
                    temp=i+1;
                }
                maxprofit= Math.max(maxprofit, profit);
                
            }else{
                buyP=list[i];
            }
        
        } System.out.println("The maximum profit you get is on day "+ temp +" that is ");
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={11,7,9,3,4,10,2,9};
        System.out.println(profit(prices));
    }
}
