
public class HdfcBank extends Bank {
public HdfcBank(String account_no,String customer_name,String trans_type,double balanceamount,double trans_amount)
	
	{
		super(account_no,customer_name,trans_type,balanceamount,trans_amount);
		
	}
	double calculate_Interest()
	  {
		double interestamount=0;
		 balanceamount=this.balanceamount;
		interestamount = (balanceamount *  7.2)/100;
		return interestamount;
		  
	  }
	public void display()
	  {
		  super.display();
		  System.out.println("bakName is:" +"hdfc");
		  System.out.println("Interest amount: Rs." +calculate_Interest());
		  if (trans_type.equals("deposit")) {  
			  balanceamount = balanceamount + trans_amount;
			  System.out.println("New Balance: " +balanceamount);
				
			}
	  }

}
