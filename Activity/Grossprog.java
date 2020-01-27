package Activity;
import java.util.Scanner;

public class Grossprog {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("how many eggs do u have");
	int eggs= sc.nextInt();
	int gross=eggs/144;
	int abovegross=eggs%144;
	int dozens = abovegross/12;
	int extras = abovegross%12;
	System.out.println("ur no of eggs is " +gross+"gross, " +dozens+ "dozen, and"+ extras);
	
}
	
}
