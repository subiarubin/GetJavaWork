package Activity;

public class Bankdemo {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.display();
		
		
		Branch br=new Branch();
		br.display();
		Customer c=new Customer();
		c.display();
		Fixedaccount f= new Fixedaccount();
		f.display();
		Recurringaccount r= new Recurringaccount();
		r.display();
		SavingsAccount s= new SavingsAccount();
		s.display();
		Services sc=new Services();
		sc.display();
	}

}
