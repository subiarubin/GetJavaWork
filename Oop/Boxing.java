package Oop;

public class Boxing {

	public static void main(String[] args) {
		int a=0,b=0;
		if(args.length!=0)
		{ 
			//Unboxing....
			//convert String object into integer values to store it in a
			a=Integer.parseInt(args[0]);
			//convert String object into integer values to store it in b
			b=Integer.parseInt(args[1]);
			//boxing- converting value into an object
			Integer result=a+b;
			System.out.println(a+b);
		}
		
		else
		{
			System.out.println("please pass 2 arguments");
		}
	}

	}


