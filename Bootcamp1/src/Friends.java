import java.util.Scanner;
public class Friends {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the 3 ages of friends");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int max = (a>b ? (a>c ? a : c): (b>c ? b : c));
        System.out.println("oldest friend: " +max+ "years");
        int min = (a<b ? (a<c ? a : c): (b<c ? b : c));
        System.out.println("Youngest friend: " +min+ "years");
}
}
		   

