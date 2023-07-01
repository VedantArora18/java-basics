import java.uttil.*;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
public class adv3{
    public static void main(String args[]){
        
        int h=5;
        int s=h*3;
        for (int i=1; i<=h; i++){
            for(int j=1; j<=s-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }
        
    }
}