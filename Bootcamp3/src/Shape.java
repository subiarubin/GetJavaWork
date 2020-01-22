
import java.util.Scanner;


class Triangle 
	{
		float base,height;
		//constructor overloading
		Triangle(float base, float height){
			this.base = base;
			this.height = height;
		}
		public void calcArea() {
			float area = 0.5f*base*height;
			System.out.println("Shape of triangle is:"+area);
		}
	}
class Rectangle 
	{
		float length,breadth;
		
		//constructor overloading
		Rectangle(float length, float breadth){
			this.length = length;
			this.breadth = breadth;
		}
		public void calcArea() {
			float area = length*breadth;
			System.out.println("Shape of Rectangle is: "+area);
		}
	}
class Square 
	{
		float side;
		//constructor overloading
		Square(float side){
			this.side = side;
		}
		public void calcArea() {
			float area = side*side;
			System.out.println("Shape of Square is: "+area);
		}
	}

	class Shape
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Triangle t = new Triangle(0, 0);
		System.out.print("Enter base and height of triangle: ");
		t.height = sc.nextFloat();
		t.base = sc.nextFloat();
		Rectangle r = new Rectangle(0, 0);
		System.out.print("Enter breadth and length of Rectangle: ");
		r.breadth = sc.nextFloat();
		r.length = sc.nextFloat();
		Square s = new Square(0);
		System.out.print("Enter side of Square: ");
		s.side = sc.nextFloat();
		t.calcArea();
		r.calcArea();
		s.calcArea();
		
	}

}

