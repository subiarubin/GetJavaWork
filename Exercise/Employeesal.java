package Exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Employeesal {

	
	static String emp_name[]= {"sys","sha","bau"};
static float emp_sal[] = {234.00f,521.00f,524.00f};
 static int emp_age[];


	public static void main(String[] args) throws IOException 
	{
		emp_age=new int[3];
		Employeesal el = new Employeesal();
		
//to accept data into age array,we need to create input stream reader object		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<emp_age.length;i++)
		{
			System.out.println("enter age of "+emp_name[i] + ":");
			emp_age[i]=Integer.parseInt(br.readLine());
		}
		//
		display();
	}
		//end of  main  method or thread
		public static void display( )
		{
			System.out.println("employees name:");
			for(String ename: emp_name)
			{
				System.out.println(ename);
				
			}
			System.out.println("employee salaries");
			for(float esalary :emp_sal)
			{
				
				System.out.println(esalary);
			}
			System.out.println("emp ages");
			for(float eages:emp_age)
			{
				System.out.println(eages);
				System.out.println("emp ages");
			}
		}
		

	

}
