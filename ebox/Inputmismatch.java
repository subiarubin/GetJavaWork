package ebox;
import java.util.InputMismatchException;
import java.util.* ;

public class Inputmismatch
{

  public static void main ( String[] args ) 
  {
    Scanner scan = new Scanner( System.in  );
    int num ;

    System.out.println("Enter an integer input");
        
  
    try
    { 
      num    = scan.nextInt();  
      if(num==num)
      
    	  System.out.println("Entered value is " + num); 
      else
      {
     // System.out.println("Entered value is " + num);
      throw new InputMismatchException();
    } 
    }
    catch ( InputMismatchException ex )
    { 
      System.out.println(ex );
      
    } 


  }
}














