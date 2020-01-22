
import java.io.IOException;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Shapedemo
{
static Scanner sc=new Scanner(System.in);
static DecimalFormat df=new DecimalFormat("##.00");
public static void main(String[] args) throws IOException
{
Shape s;
System.out.println("Select a shape\n1.Triangle\n2.Trapezoid\n3.Hexagon");
int option=sc.nextInt();
switch(option)
{
case 1: s=new Triangle();
s.numberOfSides();
area(s,option);
break;
case 2: s=new Trapeziod();
s.numberOfSides();
area(s,option);
break;
case 3: s=new Hexagon();
s.numberOfSides();
area(s,option);
break;
default: System.out.println("Invalid choice");
}
}
public static void area(Shape s, int option)
{
float area;
switch(option)
{
case 1:
float base,height;
System.out.println("Enter base and height of the triangle");
base=sc.nextFloat();
height=sc.nextFloat();
area=(float) (0.5*base*height);
System.out.println("Area of triangle is "+df.format(area));
break;
case 2:
double side1,side2,height1;
            System.out.println("Enter Length of Two Parallel Sides of Trapezium");
            side1=sc.nextDouble();
            side2=sc.nextDouble();
                System.out.println("Enter Height of Trapezium");
                height1=sc.nextDouble();
                area = (float) (1.0 / 2 * (side1 + side2) * height1);
                System.out.println("Area of Trapizoid " + df.format(area));
                break;
case 3:
System.out.println("Enter the side of a Hexagon");
            double side=sc.nextDouble();
            area = (float) ((( 3 * Math.pow(3, 1/3) * Math.pow(side, 2))) / 2);
                System.out.println("Area of Hexagon " + df.format(area));
                break;
}
}
}

