package Activity;

public class Operator {

	public static void main(String[] args) {
		int i=0,j=2;
		boolean b =(i<j) && (j++>i);
		System.out.println(j);
		b= (i>j) & (j++>i);
		System.out.println(j);
	}

}
