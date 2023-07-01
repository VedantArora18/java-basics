package arrays2D;
import java.util.*;
import java.lang.*;
public class diagonal {
    public static void n2diagsum(int matrix[][]){
        int n= matrix.length;
        int sum1=0;
        int sum2=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sum1+=matrix[i][j];

                }else if(i==n-1-j){
                    
                    sum2+=matrix[i][j];
                }
            }
        }
        System.out.print("Sum of primary diagonal ");
        System.out.println(sum1);
        System.out.print("Sum of secondary diagonal ");
        System.out.println(sum2);
        

    }
    public static void ndiagsum(int matrix[][]){
        int n= matrix.length;
        int sum1=0;
        int sum2=0;
        for(int i=0; i<n; i++){
            sum1+=matrix[i][i];
            if(i!= n-1-i){
                sum2+= matrix[i][n-i-1];
            }
        }
        System.out.print("Sum of primary diagonal ");
        System.out.println(sum1);
        System.out.print("Sum of secondary diagonal ");
        System.out.println(sum2);
        

    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side of square matrix :");
        int n=sc.nextInt();
        
        int matrix[][]= new int [n][n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] +" ");
            }System.out.println();
        }
        
       
        n2diagsum(matrix);
        ndiagsum(matrix);
    }
}

