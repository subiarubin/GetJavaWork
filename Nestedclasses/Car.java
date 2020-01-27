package Nestedclasses;

public class Car {

	
		//local instance variables
		private String carNumber;
		private String carModel;
		private String carName;
		private StringBuilder carOwnerName;
		private boolean keyStatus;
		//no argument constructor
	Car()
	{
		System.out.println("car created");
		carNumber="AP1234";
		carModel="desire";
		carName="swift";
		carOwnerName=new StringBuilder().append("sami");
		keyStatus=true;

	}
	//override toString() method
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carModel=" + carModel + ", carName=" + carName + ", carOwnerName="
				+ carOwnerName + ", KeyStatus=" + keyStatus + "]";
	}
	//inner class-writing a class inside a class block
	class Engine
	{
		public String horsePower;
		public String engineMake;
	Engine()
	{
		 horsePower="4.2";
		 engineMake="hitachi";
		System.out.println("Engine created,horse power"+horsePower+"make:"+engineMake);
		
	}
	   Engine(String engineMake)
	   {
		   this.engineMake=engineMake;
		   this.showEngine();
	   }
	  public void showEngine()
	  {
		  Car yourcar=new Car();
		  yourcar.carModel="Maruthi";
		  yourcar.carName="Baleno";
		  yourcar.carOwnerName.append("shab");
		  yourcar.keyStatus=false;
		  
		  System.out.println("your car keys are with me; "+yourcar.keyStatus);
	  }
	}
}
	
	
	


