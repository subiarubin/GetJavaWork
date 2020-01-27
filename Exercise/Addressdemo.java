package Exercise;

public class Addressdemo {

	public static void main(String[] args) {
		Addressbook ab = new Addressbook();
		Addressbook.Address address = new Addressbook().new Address();
		address.setHouseaddress("bankers colony");
		address.setName("sub");
		address.setCity("vijayawada");
		address.setState("AP");
		address.setStreet("bavani puram");
		
		ab.setTempAdd(address);
		
		Addressbook.Address permaddr = new Addressbook().new Address();
		permaddr.setHouseaddress("teachers colony");
	     permaddr.setName("rekha");
		permaddr.setCity("hyd");
		permaddr.setState("Ts");
		permaddr.setStreet("amba puram");
		
		ab.setNormAdd(permaddr);
		System.out.println("Temporary address:\n"+ab.getTempAdd());
		System.out.println("Permanent address:\n"+ab.getNormAdd());
	
		
		
	}

}
