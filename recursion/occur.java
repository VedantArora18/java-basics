package recursion;

public class occur {
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2,3,4,2,5,1,2,6,2,2,2,2};
        int key=2;
        System.out.println(occ(arr, key,0, 0));
    }
    public static int occ(int arr[], int key, int i,int c){
        
        if(i==arr.length){
            return c;
        }
        if(arr[i]==key){
            
            c=c+1;
        }
        return occ(arr, key, i+1, c);
    }
}
