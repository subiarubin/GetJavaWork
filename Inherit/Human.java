package Inherit;

public class Human extends Species{
	public static int legs=2;
	public boolean swimmingStatus;
	Human()
	{
		swimmingStatus=false;
		System.out.println("can swim");
	}
	public void brethe()
	{
		System.out.println("Can brethe");
	}
	

	public static void talk()
	
	{
		System.out.println("Can talk");
		
	}
	public void walk()
	{
		System.out.println("Can Walk"+"with"+legs+"legs");
	}

}
