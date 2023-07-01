package basics;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class pracQ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		int T= sc.nextInt();
		for(int i=0 ; i<T; i++){
		    for(int j=0; j<3; j++){
		        int X=sc.nextInt();
		        int Y=sc.nextInt();
		        int Z=sc.nextInt();
		        count=X*4+Y*2;
				System.out.println(count);
		    }System.out.println();
		    
		}
	}
}
