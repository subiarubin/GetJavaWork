package Oop;

public class Bird {
	//instance variables
	 public static int legs;
	 public static int wings;
	 public String birdName;
	 public String birdColor;
	 private boolean singStatus;
	 //constructor is a method used to initialize common values
	  Bird()
	  {
		  legs=2;
		  wings=2;
	  }
	 //setter methods to set value for private variable
     public void setsingingStatus()
     {
    	 if(this.birdName.equalsIgnoreCase("kokila"))
    	 {
    		 singStatus=true;
    	 }
     }
     //methods to describe the behavior of the object
	   public void walk()
	   {
		 System.out.println(birdColor+" " +birdName+ " is walking with " + legs+" legs.");
	   }
	      public void fly()
	      {
	    	System.out.println(birdColor+" "+birdName+" is flying with " + wings+" wings.");  
	      }
	      public void sing()
	      {
	    	  if(singStatus) {
	    		  System.out.println("lalala");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("can't sing ");
	      }

      }
}	      
