package Inherit;

public class Circle extends Shape 
{
	float radius,area;
	final static float PI=3.134f;
	//default constructor
	Circle()
	{
		System.out.println("constructing circle object");
	}
	//overloaded constructor
	Circle(float radius)
	{
		this.radius=radius;
	}
	public void calcArea()
	{
		area=PI*radius*radius;
		System.out.println("area of circle is:"+area);
	}
}


