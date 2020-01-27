package Activity;
import static java.lang.System.out;
import java.util.Scanner;

public class Account extends Bank//Inheritance
{ 

	private int accountno;
	private String accttype;
	private int balance;
	private	String username;
	private int ifsccode;

	
	
	 //default constructor
	 public Account()
	 {
		 
	 }
	 
	
	//parameterized constructor
	public Account(int accountno, String accttype, int balance, String username, int ifsccode) {
	super();
	this.accountno = accountno;
	this.accttype = accttype;
	this.balance = balance;
	this.username = username;
	this.ifsccode = ifsccode;
	

	
}
	
	//Encapsulation
		 public int getAccountno() {
				return accountno;
			}
	
	        public void setAccountno(int accountno) {
			this.accountno = accountno;
		}
		public String getAccttype() {
			return accttype;
		}
		public void setAccttype(String accttype) {
			this.accttype = accttype;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public int getIfsccode() {
			return ifsccode;
		}
		public void setIfsccode(int ifsccode) {
			this.ifsccode = ifsccode;
		}
		

        public void display()
        {
        	System.out.println("this is a account");
        }
        } 
		/*	public static  void main(String[] args) {
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
	*/
		
	
		
		
		
		


	
		
		
		


	


