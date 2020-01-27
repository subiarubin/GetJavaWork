package Exercise;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Checkdate {

	public static void main(String[] args) {
		
		
		int year = 0;
		int dd = 0;
		int month = 0;
				    
		    Scanner sc= new Scanner(System.in);
		    System.out.println("enter the day(1-31)");
		    sc.nextInt();
		    Scanner sc1= new Scanner(System.in);
		    System.out.println("enter the month");
		    sc1.nextInt();
		    Scanner sc2= new Scanner(System.in);
		    System.out.println("enter the year");
		    sc2.nextInt();
		    Date date = (new GregorianCalendar(year,month,dd)).getTime();
			
		    SimpleDateFormat formatter = new SimpleDateFormat("E");  
		    String strDate= formatter.format(date); 
             String day = null;
		      if (day==("monday"))
             {
            	 System.out.println("white");
            	
             }
		      if (day==("tuesday"))
	             {
	            	 System.out.println("pink");
	            	
	             }
		      if (day==("wednesday"))
	             {
	            	 System.out.println("violet");
	            	
	             }
		      if (day==("thursday"))
	             {
	            	 System.out.println("indigo");
	            	
	             }
		      if (day==("friday"))
	             {
	            	 System.out.println("blue");
	            	
	             }
		      if (day==("saturday"))
	             {
	            	 System.out.println("no color");
	            	
	             }

      		}



	}

