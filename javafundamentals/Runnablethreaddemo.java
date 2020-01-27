package javafundamentals;

 class  Mythread1 implements Runnable
{
	 private String threadName;
	 Mythread1(){
		 threadName="Mythread";
		 System.out.println("thread "+threadName+" created");
		 
	 }
	 @Override
	 public void run()
	 {
		 System.out.println(threadName+" running succesfully");
	 }
}
     public class Runnablethreaddemo
     {
    	

		

		public static void main(String[] args) {
	
	System.out.println("thread name "+Thread.currentThread().getName()+" started");
	Mythread1 mt = new Mythread1();
	mt.run();
	

	}

}
