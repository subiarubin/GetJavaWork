package Exercise;

public class Scientificdemo implements physicalConstants{

	public static void main(String[] args) {
		Scientificdemo.Einsteinformula();
		Scientificdemo.Newtonsformula();
		Scientificdemo.velocity();
	}
public static void Einsteinformula()
{
	int mass=12;
			long energy=mass*SPEED_OF_LIGHT_IN_VACCUM;
	System.out.println("Energy= "+energy+"einstein");
}

public static void Newtonsformula()
{
	int m1=12,m2=19;
	float radius=1.2f;
	double force=GRAVITATIONAL_CONSTANT*(m1*m2)/(Math.exp(radius));
	System.out.println("Force="+force+"newtons");
	}

public static void velocity()
{
	double d;
	int t=6;
	d=(0.5f)*STANDARED_GRAVITATIONAL_ACCELERATION*t;
	System.out.println("velocity="+d+ "velocity");

}
}
