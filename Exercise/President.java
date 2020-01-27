package Exercise;

public class President {

	   private static President ramnadh = new President( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private President() { }

	   /* Static 'instance' method */
	   public static President getInstance( ) {
	      return ramnadh;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	}    	
   


