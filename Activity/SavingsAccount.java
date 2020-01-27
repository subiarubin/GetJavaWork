package Activity;
import static java.lang.System.out;
import java.util.Scanner;

	public class SavingsAccount extends Account
	{
		//abstraction
		private int accountnumber;
		//encapsulation
		public int getAccountnumber() {
			return accountnumber;
		}

		public void setAccountnumber(int accountnumber) {
			this.accountnumber = accountnumber;
		}
		public void display()
		{
			System.out.println("this is a savings account");
		}
	}
		  /*  Scanner sc = new Scanner(System.in);
			out.println("Enter Account No: ");
			long accno = sc.nextLong();
			out.println("Account no :" +accno);*/

	


