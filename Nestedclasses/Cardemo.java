package Nestedclasses;

public class Cardemo {

	public static void main(String[] args) {
		// create object for car class
		Car mycar=new Car();
		//print the object -internally it calls toString()method of java.lang.Object as it is superclass for car
		System.out.println(mycar);
        Car c= new Car();
        Car.Engine yourcar=c.new Engine("hino");

	}

}
