import java.util.Scanner;


public class Computequotient {



 public static void main(String[] args)  {
  int dividend=0, divisor=0;
      
        dividend=Integer.parseInt(args[0]);
        
        divisor =Integer.parseInt(args[1]);
        System.out.println("the command line arguments are: 55 8");
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient :" + quotient);
        System.out.println("Remainder : " + remainder);
       
          }
}

