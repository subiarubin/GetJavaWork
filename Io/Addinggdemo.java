package Io;
 //exception handling
//custom exception

public class Addinggdemo {

	public static void main(String[] args) {
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
	              catch(ArithmeticException ae)
	                {
	                	 System.out.println("please pass non zero values and 2 arguments"); 
	                }
	              
	              catch(NumberFormatException ne)
	                {
	                	 System.out.println("please pass numbers only"); 
	                }
	              
	              
	                 catch(Exception e)
	                {
	                	 //e.printStacktrace();
	                	 System.out.println("exception occured");
	                	 
	                }
	 finally
	 {
		 result=null;
         System.out.println("result object set to null,finally block executed");
	 }
	       
	              
	              
	              
		 } 
			 
		

	}

}
