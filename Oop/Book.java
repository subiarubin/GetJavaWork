package Oop;
import java.time.LocalDate;

public class Book {
	public int bookNumber;
	private boolean return_Status;
	private LocalDate borrowedDate,returnDate,returnableDate;
    private float ammountPayable=0.0f;  
    
    public void borrowBook()
	 {
	    Checkdate borrowedDate=LoacalDate.now();

	}
     public void returnBook()
     {
    	 returnDate=LoacalDate.now();
    	 returnableDate=borrowedDate+7;
    	 if(returnDate<=returnableDate)
    	 {
    		 returnStatus=true;
    	 }else
    	 {
    		 ammountPayable=(returnDate-returnableDate)*10;
    	 }
     }
}
