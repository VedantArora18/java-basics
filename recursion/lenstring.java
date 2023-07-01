package recursion;

public class lenstring {
    public static void main(String args[]){
        String str="VedantArora";
        len(str, 0, 0);
    }
    public static int len(String str, int i,int c){
        if(i==str.length()){
            System.out.println();
            System.out.println(c);
            return c;
        }
        System.out.print(str.charAt(i));
        c+=1;
        
        return len(str, i+1, c);
    }
}
