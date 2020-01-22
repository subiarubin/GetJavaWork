import java.util.Scanner;
public class Electrticity 
{

	   	
	  public static void main(String[] args)
	  {
	   String name;
	   int Units; 
	   double Tot_Amount;
	   Scanner  sc = new Scanner(System.in);
	   System.out.println("Enter Customer name:");
	   name=sc.next();
	   System.out.print(" Please Enter the Units Consumed : ");
	   Units = sc.nextInt();
	   Tot_Amount = Electricity(Units);
	   System.out.println("\n Electricity Bill  =  " + Tot_Amount);
	  }
	  public static double Electricity(int Units)
	  {
	   double unitscharge,Amount,servicetax=14.75, Tot_Amount;
	   int fixedrent=250;
	   if (Units <=100)
	     {
	          unitscharge = Units * 3.25;
	          
	          
	     }
	     else if (Units <= 200)
	     {
	      unitscharge = Units * 4.75;
	     
	      
	     }
	     	     else
	     {
	       unitscharge = Units * 6.35;
	       
	   }
       Amount=unitscharge+fixedrent;
	   Tot_Amount = Amount * servicetax;
	   return Tot_Amount;
	   
	   
	  }
	 }


