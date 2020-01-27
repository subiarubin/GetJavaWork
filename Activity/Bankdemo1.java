package Activity;

public class Bankdemo1 {
	public static void main(String args[])
	{
	Account a=new Account(525455, "savings",50000,"sub",98865);

	System.out.println(a.getAccountno() +a.getAccttype() +" "+ a.getBalance()+ a.getUsername() +" " + a.getIfsccode());
	
	{   
		System.out.println(a  instanceof Account);
	}
	a.display();
	
    Customer c=new Customer();
	
	if(c instanceof Customer)
	

		System.out.println("true");
		else
		System.out.println("false");
	
    c.display();
	
    Bank b=new Bank();
    b.display();
    
    
    
    SavingsAccount s=new SavingsAccount();

	System.out.println(s.getAccttype());
    s.display();
    
    Recurringaccount r=new Recurringaccount();

	System.out.println(r.getAccountno());
    r.display();
    Branch br=new Branch();
    br.display();
    Services ser=new Services();
    ser.display();
}

}



