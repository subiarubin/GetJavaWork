package Io;
class Myexception extends Exception
{ 
	 //constructor
	  Myexception()
	{
		System.out.println("my exception created");
	}
	 public Myexception handler()
	 {
		 System.out.println("exception handled here");
		 return this;
	 }
}
     public class Addingdemo1 {

	public static void main(String[] args)throws Myexception {
     int a,b;
     Integer result;
	 if(args.length!=2)
		 {
		  System.out.println("please pass 2 arguments"); 
		 }
	 else
     {
	 try 
     {
		    
	  a=Integer.parseInt(args[0]);
	   b=Integer.parseInt(args[1]);
	              
	    result=a/b;
	    System.out.println(result);
	  }
	 catch(Exception e)
     {
     	 //e.printStacktrace();
     	 System.out.println("exception occured");
     	 throw new Myexception().handler();
     	 
     }
finally
{
result=null;
System.out.println("result object set to null,finally block executed");
}
     }
	}	 

  }
