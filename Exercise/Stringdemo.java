package Exercise;

public class Stringdemo {

	public static void main(String[] args) {
	String s1="Hello";
	String s2= new String("Hello");
	Integer age1=45;
	Integer age2=23;
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(age1.hashCode());
	System.out.println(age2.hashCode());
	
	
	  if(s1==s2)
	  {
		  System.out.println("only 1 object refferd by two reference s1 and s2");
	   	  
	  }
       if(s1.equals(s1))
       {
    	   System.out.println("both objects are same"); 
       }
       if(age1==age2)
       {
    	   System.out.println("both ages are same");
       }else
       {
    	   System.out.println("both ages are not same");
       }
	}

}
