package Inherit;

public class Bikedemo {
	public static void main(String[] args) {
		Bike b=new Bike();
		boolean isBikeselfdriven=b.selfdriven();
		if(isBikeselfdriven)
		{
			System.out.println("Bike drivesitself,juz we have to rise it");
			
		}
b.balance();
}

}
