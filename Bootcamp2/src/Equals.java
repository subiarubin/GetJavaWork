import java.util.Arrays;
import java.util.Scanner;

public class Equals 
{
	    public static boolean areEqual(int a[], int b[])
	    {
	    int n = a.length;
	        int m = b.length;
	        if (n != m)
	         return false;
	        Arrays.sort(a);
	        Arrays.sort(b);
	        for (int i = 0; i < n; i++)
	            if (a[i] != b[i])
	                return false;
	        return true;
	    }
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    int x[] = new int[5];
	    for (int i = 0 ; i <x.length; i++ )
	     {
	      x[i]=sc.nextInt();
	    
	     }
	   int y[] = new int[5];
	   for (int j = 0 ; j <x.length; j++ )
	   {
	      y[j]=sc.nextInt();
	     }
	        if (areEqual(x,y))
	            System.out.println("Equal");
	        else
	            System.out.println("Not Equal");
	    }
	}


