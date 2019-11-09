package org.animals;

class Animaldemo
  {
     public static void main(String args[])
      {
         Lion l = new Lion("white",2.2f,11);
         Monkey m = new Monkey("black",2.4f,15);
	 Elephant e = new Elephant("ivory",2.20f,21);


       System.out.println(l.color+" Lionweight is" +l.weight+" and it has" +l.age+" years of age" );
       System.out.println(m.color+" Monkeyweight is" + m.weight+" and it has"+ m.age+" years of age" );
       System.out.println(e.color+" Elephantweight is" +e.weight+" and it has" +e.age+" years of age" );
     }
 }