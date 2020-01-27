package Activity;
import static java.lang.System.out;
import java.util.Scanner;
public class Bank {

	//abstraction
	private int bankid;
	private String bankname;
	private int ifsc;
	
	

	/*    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		out.println("Enter BankId: ");
		int id = sc.nextInt();
		out.println("Enter BankName: ");
		String name = sc.next();
		out.println("Enter IFSC Code: ");
		String ifsc = sc.next();
		out.println("BankID  :" +id);
		out.println("BankName :" +name);
		out.println("Ifsc:" +ifsc);

	}*/

	//encapsulation
	public int getBankid() {
		return bankid;
	}


	public void setBankid(int bankid) {
		this.bankid = bankid;
	}


	public String getBankname() {
		return bankname;
	}


	public void setBankname(String bankname) {
		this.bankname = bankname;
	}


	public int getIfsc() {
		return ifsc;
	}


	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public void display()
	 {
		System.out.println("this is a bank");
	}

}
