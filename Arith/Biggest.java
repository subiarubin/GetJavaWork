package Arith;
import java.util.Scanner;
public class Biggest {
	
	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("enter three numbers");
		    a = sc.nextInt();
	        
	        b= sc.nextInt();
	       
	        c = sc.nextInt();
	        if(a > b && a > c)
	        System.out.println("Largest number is:"+a);
	        else if(b > c)
	        System.out.println("Largest number is:"+b);
	        else
	        System.out.println("Largest number is:"+c);
	    }     
	
}       
	


