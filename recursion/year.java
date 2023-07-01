package recursion;

public class year {
    public static void main(String args[]){
        words(1947);
    }
    public static void words(int yr){
        if(yr==0){
            return;
        }
        int n=yr%10;
        
        if(n==0){
            System.out.print("zero");
        }else if(n==1){
            System.out.print("one");
        }else if(n==2){
            System.out.print("two");
        }else if(n==3){
            System.out.print("three");
        }else if(n==4){
            System.out.print("four");
        }else if(n==5){
            System.out.print("five");
        }else if(n==6){
            System.out.print("six");
        }else if(n==7){
            System.out.print("seven");
        }else if(n==8){
            System.out.print("eight");
        }else{
            System.out.print("nine");
        }System.out.print(" ");
        words(yr/10);
    }
}
