package Oop;

public class Birddemo {

	public static void main(String[] args) {
		// create object for class bird
		Bird p=new Bird();
		//set values to attributes
		p.birdColor="green";
		p.birdName="parrot";
		/*p.legs=2;
		p.wings=2;*/
		//call walk method
		p.walk();
		p.setsingingStatus();
		p.sing();
		//call fly method
		p.fly();
		Bird k= new Bird();
		k.birdColor="black";
		k.birdName="kokila";
		k.walk();
		k.setsingingStatus();
		k.sing();
		k.fly();
		System.out.println("object id:"+p.hashCode());

	}

}
