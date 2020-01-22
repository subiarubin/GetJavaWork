import java.util.Scanner;
public class Swap {
	
	
	    public static void main(String args[])
	    {
	        int num1, num2;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two integers:");
	        num1 = scanner.nextInt();
	       
	        num2 = scanner.nextInt();
	        System.out.println("Pre swapping");
	        System.out.println(num1+" "+num2);
	        num1 = num1 ^ num2;
	        num2 = num1 ^ num2;	       
	        num1 = num1 ^ num2;	       
	        System.out.println("After swapping:"+num1+" " +num2);
	      
	    }
	}

