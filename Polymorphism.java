
package Oop;
import java.util.Scanner;
import static java.lang.System.out;
 
public class Polymorphism
{  
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
	  int x=0,y=0,choice = 0;
	  float a=0,b=0;
	  double result=0.0;
      
      out.println("1.Add 2 integers\n 2. Add 2 real numbers\n 3.Exit");
      out.println("enter ur choice");
      choice = sc.nextInt();
      
     switch(choice)
     {
        case 1 : result= add(x,y);
                 break;
        case 2 : result= add(a,b);
                 break;
        case 3 : break;        
     } 
        out.println("result:" +result);
   }
  
		public static int add( int x, int y)
      {
         out.println("enter 1st integer");
         x=sc.nextInt();
         out.println("enter 2nd integer");
         y=sc.nextInt();
    	 return x+y;
    	 
      }
       public static float add( float a, float b)
     {
    	   out.println("enter 1st integer");
           a=sc.nextFloat();
           out.println("enter 2nd integer");
           b=sc.nextFloat();
      	 
    	 return(a+b);
     }
}
	



