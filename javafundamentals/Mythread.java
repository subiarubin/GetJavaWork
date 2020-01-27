package javafundamentals;

public class Mythread  extends Thread{
    Mythread()
    {
    	System.out.println("myThread created");
    }
	
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
			System.out.println("my thread"+this.getName()+" is running");
				try {
					this.sleep(1000);
				
				   }catch(InterruptedException ie)
				{
					   System.out.println("thread"+this.getName()+" Interrupted");
				}
	}
	
	

	public static  class Threaddemo
	{
	

	public static void main(String[] args) {
		
		Mythread mt=new Mythread();
		mt.start();
		Mythread nt=new Mythread();
		nt.start();
	  }
	}
}
