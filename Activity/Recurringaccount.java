package Activity;

public class Recurringaccount extends Account
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
		System.out.println("this is a recurrings account");
	}	
}


