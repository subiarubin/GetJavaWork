package Activity;
import java.util.Scanner;
public class Palinprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(num>0) 
		{
			int digi = num%10;
			rev = rev*10+digi;
			num = num/10;
		}
			if(temp==rev) 
				System.out.println("The given number is palindrome");
			else
				System.out.println("The given number is not palindrome");
		if(num !=0 && num !=1) 
		{
			System.out.println("Not Prime");
		
			for(int i=2;i<=num;i++)
			{
				if(num%i ==0)
				{
					System.out.println("Not Prime");
				}
				else
				{
					System.out.println("Prime");
				}
			}
		}
		
	}
	

}
