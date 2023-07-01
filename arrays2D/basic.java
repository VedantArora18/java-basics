package arrays2D;
import java.util.*;
import java.lang.*;
public class basic {
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]== key){
                    System.out.print("Position is: "+ (i+1)+","+(j+1));
                    return true;
                }
            }
        }
        System.out.print("Not found");
        return false;

    }
    public static void maxmin(int matrix[][]){
        int max=0;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]>max){
                   max=matrix[i][j];
                   
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    
                 }
            }
        }
        System.out.println("The Largest element is: "+ max);
        System.out.println("The smallest element is: "+ min );

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
        System.out.println("Enter element to search");
        int key=sc.nextInt();
        search(matrix, key);
        System.out.println();
        maxmin(matrix);
    }
}
