package arrays2D;
import java.util.*;
import java.lang.*;
public class search {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element you want to search:");
        int key= sc.nextInt();
        int matrix[][]= {{10,20,30,40},{15,25,35,45},
                        {27,29,37,48},{32,33,39,50}};
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matrix[i][j] +"  ");
            }System.out.println();
            System.out.println();
        }
        searchsort(matrix,key);
    }
    public static boolean searchsort(int matrix[][], int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println((row+1) +" "+ (col+1));
                return true;
            }else if( key< matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Not found");
        return false;

    }
}