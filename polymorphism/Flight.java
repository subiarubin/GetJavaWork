package polymorphism;

public class Flight extends Bird implements Inherit.Automobile {
	private int wheels;
	public String flightNumber;
	private String airLines;
	
	
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}
	@Override
	public boolean selfdriven() {
		// TODO Auto-generated method stub
		return true;
	}
	  @Override
     public void fly()
    {
		  //we can superclass fly method also by using super keyword
		  //super.fly();
System.out.println("Flight " + this.flightNumber + " belongs to " + this.airLines + " starting..."+" has " + this.tails +" tail decorated with one tail");		  
		System.out.println("start first engine");
		System.out.println("drive the flight towards runway");
		System.out.println("once flight reaches the runway");
		System.out.println("start second engine");
		System.out.println("take Off");
		
    }

}
