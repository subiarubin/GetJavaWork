package polymorphism;

public class Filghtdemo {

	public static void main(String[] args) {
		//creating object for flight class
		Flight f=new Flight();
		
		//set the values to Flight class attributes or properties or class instance variables
		f.flightNumber = "AI307";
		//f.tails=1;
		f.setWheels(16);
		f.setAirLines("Air India");
		//calling methods to flight class
		f.fly();
		
	}

}
