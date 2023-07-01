package arrays2D;
import java.util.*;
import java.lang.*;
public class transpose {
    public static void transpose(int matrix[][]){
        for(int j=0; j<matrix[0].length; j++){
            for(int i=0; i<matrix.length; i++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter number of columns:");
        int m= sc.nextInt(); 
        int matrix[][]= new int [n][m];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] +" ");
            }System.out.println();
        }
        transpose(matrix);
    }
}
