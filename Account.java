package Activity;
import static java.lang.System.out;
import java.util.Scanner;

public class Account {
	
	public static  void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		
		int accountno;
		String accttype;
		int balance;
		String username;
		int ifsccode;
		
	     out.println("enter number ");
	     accountno = sc.nextInt();
	     out.println(" enter aacounttype");
	     accttype = sc.next();
	     out.println(" enter balance");
	     balance = sc.nextInt();
	     out.println(" enter username");
	     username = sc.next();
	     out.println(" enter ifsc code");
	     ifsccode = sc.nextInt();
	         
	     
	        out.println("Account no :" +accountno);
			out.println("Account type :" +accttype);
			out.println("Balance:" +balance);
			out.println("Username :" +username);
			out.println("Ifsc:" +ifsccode);
		
	
	   }
		
	}
	
		
	
		
		
		
		


	
		
		
		


	


